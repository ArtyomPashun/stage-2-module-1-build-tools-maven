package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (!org.apache.commons.lang3.StringUtils.isBlank(str) && !str.equals("null")) {
            double num = Double.parseDouble(str);
            return num > 0;
        } else {
            return false;
        }
    }
}
