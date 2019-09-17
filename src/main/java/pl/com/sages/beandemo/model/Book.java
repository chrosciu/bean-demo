package pl.com.sages.beandemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    //@NotBlank
    private String author;
    private int year;
}
