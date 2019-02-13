package com.codyvanderpoel.springtargetpractice.forms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HowManyPointsForm {
    public Integer action;

    public Boolean isValid() {
        return action != null;
    }

    public String howManyPoints() {
        if (action == 1){
            return "An extra kick is worth 1 point";
        } else if (action == 2) {
            return "An extra conversion is worth 2 points";
        } else if (action == 3) {
            return "A safety is worth 2 points";
        } else if (action == 4) {
            return "A field goal is worth 3 points";
        } else if (action == 5) {
            return "A touchdown is worth 6 points";
        } else {
            return "What happened?";
        }
    }
}
