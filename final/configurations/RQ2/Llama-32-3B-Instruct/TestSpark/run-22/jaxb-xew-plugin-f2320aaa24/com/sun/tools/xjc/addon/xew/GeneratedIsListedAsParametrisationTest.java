package com.sun.tools.xjc.addon.xew;

public class GeneratedIsListedAsParametrisationTest {

    @Test
    public void isListedAsParametrisationTest() {
        // Given
        JClass obj = null;
        Set<String> parametrisations = new HashSet<>();

        // When
        boolean result = XmlElementWrapperPlugin.isListedAsParametrisation(obj, parametrisations);

        // Then
        assertTrue(result);
    }

}