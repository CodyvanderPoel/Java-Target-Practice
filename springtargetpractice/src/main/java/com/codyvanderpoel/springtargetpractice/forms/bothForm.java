package com.codyvanderpoel.springtargetpractice.forms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class bothForm {
        public Integer num1;
        public Integer num2;
        public void setnum1 (Integer num) {
            num1 = num;
        }
        public void setnum2(Integer num) {
            num2 = num;
        }
        public boolean isValid() {
            return num1 != null && num2 != null;
        }
        public String findTrue() {
            if (num1 == 1 && num2 == 1){
            return "It's True!";
            } else if (num1 == 2 && num2 ==2) {
                return "It's True!";
            } else {
                return "It's False!";
            }
        }

    }

