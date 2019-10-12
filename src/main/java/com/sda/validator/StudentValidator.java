package com.sda.validator;

import com.sda.dto.StudentDTO;
import org.springframework.stereotype.Component;

@Component
public class StudentValidator {

    public Boolean isNameValid(String firsName, String lastName) {
        if (firsName == null && lastName == null) {
            return false;
        }
        if (firsName.isEmpty() && lastName.isEmpty()) {
            return false;
        }
        if (!firsName.matches("([A-Z a-z])*") && !lastName.matches("([A-Z a-z])*")) {
            return false;
        }
        return true;
    }

   /* public Boolean isAgeValid(Integer age) {
        if (age == null) {
            return false;
        }
        if (age < 18 || age > 100) {
            return false;
        }
        return true;
    }*/

    public Boolean isAverageGrade(Double averageGrade) {
        if (averageGrade < 1 || averageGrade > 10) {
            return false;
        }
        return true;
    }
    public Boolean isDTOValid(StudentDTO studentDTO){
        if(isNameValid(studentDTO.getFirstName(),studentDTO.getLastName())==true && isAverageGrade(studentDTO.getAverageGrade())==true){
            return true;
        }
        return false;
    }

}
