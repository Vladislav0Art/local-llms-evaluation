package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConvertToDomainMultipleClasses {

    @Test
    public void testConvertToDomainMultipleClasses() {
        Domain domain = Domain.class;
        Object[] source = {new ArrayList<>(), new ArrayList<>()};
        String[] target = {"3", "4"};
        try {
            GeneratedTest.testConvertToDomainMultipleClasses(domain, null, source);
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // expected
        }
    }

}