package com.sun.tools.xjc.addon.xew;

public class GeneratedGenerableToStringTest {

    @Test
    public void generableToStringTest() {
        // Given
        String input = "input";

        // When
        String result = XmlElementWrapperPlugin.generableToString(input);

        // Then
        assertEquals("input", result);
    }

}