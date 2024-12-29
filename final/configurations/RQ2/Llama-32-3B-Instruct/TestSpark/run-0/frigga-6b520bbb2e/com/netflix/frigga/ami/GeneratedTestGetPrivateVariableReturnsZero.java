package com.netflix.frigga.ami;

public class GeneratedTestGetPrivateVariableReturnsZero {

    @Test
    public void testGetPrivateVariableReturnsZero() {
        PrivateClass privateClass = new PrivateClass();
        privateClass.setPrivateVariable(0);
        int result = privateClass.getPrivateVariable();
        assertEquals(0, result);
    }

}