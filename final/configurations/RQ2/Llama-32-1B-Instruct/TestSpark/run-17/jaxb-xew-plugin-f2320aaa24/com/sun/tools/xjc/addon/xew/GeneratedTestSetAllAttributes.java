package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestSetAllAttributes {

    @Test
    public void testSetAllAttributes() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        setAllAttributes(jClass, element);

        ObjectUtils.assertSame("element", getAnyElement(jClass, annotatable));
    }

}