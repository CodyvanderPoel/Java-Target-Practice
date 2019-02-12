package com.codyvanderpoel.springtargetpractice.forms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class earningsForm {
        public Integer num1;
        public Integer num2;
        public Integer num3;
        public void setnum1 (Integer num) {
            num1 = num;
        }
        public void setnum2(Integer num) {
            num2 = num;
        }
        public void setnum3(Integer num) {
            num3 = num;
        }


        public boolean isValid() {
            return num1 != null && num2 != null && num3 != null;
        }
        public Integer gatherEarnings() {
            return (num1*15)  + (num2*12) + (num3*9);
        }

    }