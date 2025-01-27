package com.sun.tools.xjc.addon.xew;

public class GeneratedCopyFieldsTest {

    @Test
    public void copyFieldsTest() {
        // Test case: Copy fields from one object to another
        Object source = new Object();
        Object destination = new Object();
        CommonUtils.copyFields(source, destination);
        assertTrue(destination instanceof Object);
    }

}