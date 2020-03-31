package com.andycen.spring.method.replacement;

/**
 * @author cenruyi
 */
public class MyValueCalculator {

    public String computeValue(String input) {
        return "String input: " + input;
    }

    public String computeValue(Integer intValue, String strValue) {
        return "Multi input: " + intValue + ", " + strValue;
    }

}
