package com.codyvanderpoel.springtargetpractice.forms;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SparselyPopulatedForm {

    public Integer num1;
    public Integer num2;
    public String howPopulated() {
        if (num1 / num2 >= 100){
            return "Densely Populated!";
        }
        else {
            return "Sparsely Populated!";
        }
    }

    public boolean isValid() {
        return num1 != null && num2 != null;
    }
}
