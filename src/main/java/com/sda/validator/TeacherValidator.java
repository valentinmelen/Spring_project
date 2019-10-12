package com.sda.validator;

import com.sda.dto.TeacherDTO;
import org.springframework.stereotype.Component;

@Component
public class TeacherValidator {

    public Boolean isNameValid(String firstName, String lastName) {
        if (firstName == null && lastName == null) {
            return false;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return false;
        }
        if (!firstName.matches("([A-Z a-z])*") && !lastName.matches("([A-Z a-z])*")) {
            return false;
        }
        return true;
    }

    public Boolean isDisciplineValid(String discipline) {
        if (discipline == null) {
            return false;
        }
        if (discipline.isEmpty()) {
            return false;
        }
        if (!discipline.matches("([A-Z a-z])*")) {
            return false;
        }
        return true;
    }

    public Boolean isDTOValid(TeacherDTO teacherDTO) {
        if ((isNameValid(teacherDTO.getFirstName(), teacherDTO.getLastName()) == true) && isDisciplineValid(teacherDTO.getDiscipline())) {
            return true;
        }
        return false;
    }

}
