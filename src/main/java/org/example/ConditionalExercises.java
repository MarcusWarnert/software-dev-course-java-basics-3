package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        if(x < 5) {
            return true;
        } else {
            return false;
        }
    }

    public String getAgeGroup(int age) {
        if (age < 13) {
            return "child";
        } else if (age < 18) {
            return "teen";
        } else {
            return "adult";
        }
    }

    public boolean isValidPassword(String password){
            int passwordLength = password.length();
            if (password.length() >= 8) {
                return true;
            } else {
                return false;
            }
    }
}
