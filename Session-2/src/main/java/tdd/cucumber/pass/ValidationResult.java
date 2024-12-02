package tdd.cucumber.pass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ValidationResult {

    @Setter
    boolean isValid = true;

    List<String> violations = new ArrayList<>();

}
