package com.codyvanderpoel.springtargetpractice.forms;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class addForm {
    public Integer num1;
    public Integer num2;


    public void setnum1 (Integer num) {
         num1 = num;
    }
    public void setnum2 (Integer num) {
         num2 = num;
    }
    public boolean isValid() {
        return num1 != null && num2 != null;
    }
    public Integer sum() {
        return num1 + num2;
    }
}
