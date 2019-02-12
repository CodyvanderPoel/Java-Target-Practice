package com.codyvanderpoel.springtargetpractice.forms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class walkOrDriveForm {
    public Integer num1;
    public Integer weather;

    public void setnum1 (Integer num) {
        num1 = num;
    }
    public void setIsNiceWeather(Integer weather) {
        weather = weather;
    }

    public boolean isValid() {
        return num1 != null && weather != null;
    }
    public String canWalk() {
        if (num1 <=0.25 && weather == 1){
            return "You should walk!";
        }
        else {
            return "You should drive..";
        }
    }

}
