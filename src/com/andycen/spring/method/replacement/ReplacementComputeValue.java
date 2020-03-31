package com.andycen.spring.method.replacement;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author cenruyi
 */
public class ReplacementComputeValue implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        String input = "";
        for (Object arg : args) {
            input += arg + ",";
        }
        input += "(The method is replaced.)";
        return input;
    }
}
