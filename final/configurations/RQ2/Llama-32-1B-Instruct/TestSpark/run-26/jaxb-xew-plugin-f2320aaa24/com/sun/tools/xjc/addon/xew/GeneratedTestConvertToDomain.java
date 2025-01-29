package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConvertToDomain {

    @Test
    public void testConvertToDomain() {
        Domain domain = Domain.class;
        Object[] source = {new ArrayList<>(), new ArrayList<>()};
        String[] target = {"1", "2"};
        try {
            GeneratedTest.testConvertToDomain(domain, null, source);
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // expected
        }
    }

}