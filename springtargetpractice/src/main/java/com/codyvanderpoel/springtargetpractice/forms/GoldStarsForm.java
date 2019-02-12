package com.codyvanderpoel.springtargetpractice.forms;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GoldStarsForm {
    public Integer num1;

    public Boolean isValid() {
        return num1 != null;
    }

    public String howManyStars() {
        if (num1 < 1000){
            return "*";
        } else if (num1 < 5000) {
            return "**";
        } else if (num1< 8000) {
            return "***";
        } else if (num1 < 10000) {
            return "****";
        } else {
            return "*****";
        }
    }
}
