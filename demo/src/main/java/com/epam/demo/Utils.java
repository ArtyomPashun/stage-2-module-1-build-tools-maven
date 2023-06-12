package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            if (!com.epam.utils.StringUtils.isPositiveNumber(arg)) {
                return false;
            }
        }
        return true;
    }
}