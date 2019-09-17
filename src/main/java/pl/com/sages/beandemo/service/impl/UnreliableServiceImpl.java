package pl.com.sages.beandemo.service.impl;

import org.springframework.stereotype.Service;
import pl.com.sages.beandemo.service.UnreliableService;

import java.util.Random;

@Service
public class UnreliableServiceImpl implements UnreliableService {
    @Override
    public int execute() {
        int random = new Random().nextInt(10);
        if (random < 6) {
            throw new NullPointerException();
        }
        return random;
    }
}
