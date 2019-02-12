package com.codyvanderpoel.springtargetpractice.forms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class doubleForm {
    public Integer num1;
    public void setnum1 (Integer num) {
        num1 = num;
    }
    public boolean isValid() {
        return num1 != null;
    }
    public Integer doubleNum() {
        return num1 * 2;
    }
}
