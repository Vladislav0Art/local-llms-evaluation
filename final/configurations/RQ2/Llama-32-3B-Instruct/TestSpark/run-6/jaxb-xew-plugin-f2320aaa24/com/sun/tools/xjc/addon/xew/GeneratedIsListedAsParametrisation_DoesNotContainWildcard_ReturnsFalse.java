package com.sun.tools.xjc.addon.xew;

public class GeneratedIsListedAsParametrisation_DoesNotContainWildcard_ReturnsFalse {

    @Test
    public void isListedAsParametrisation_DoesNotContainWildcard_ReturnsFalse() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        assertFalse(instance.isListedAsParametrisation("*"));
    }

}