package com.codyvanderpoel.springtargetpractice.forms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class walkOrDriveForm {
    public Double num1;
    public Integer num2;


    public boolean isValid() {
        return num1 != null && num2 != null;
    }
    public String canWalk() {
        if (num1 <=0.25 && num2 == 1){
            return "You should walk!";
        }
        else {
            return "You should drive..";
        }
    }

}
