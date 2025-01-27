package com.sun.tools.xjc.addon.xew;

public class GeneratedIsHiddenClassTest {

    @Test
    public void isHiddenClassTest() {
        // Given
        JClass obj = null;

        // When
        boolean result = XmlElementWrapperPlugin.isHiddenClass(obj);

        // Then
        assertFalse(result);
    }

}