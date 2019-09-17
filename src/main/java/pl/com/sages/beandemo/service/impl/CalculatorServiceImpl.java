package pl.com.sages.beandemo.service.impl;

import org.springframework.stereotype.Service;
import pl.com.sages.beandemo.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return  a / b;
    }
}
