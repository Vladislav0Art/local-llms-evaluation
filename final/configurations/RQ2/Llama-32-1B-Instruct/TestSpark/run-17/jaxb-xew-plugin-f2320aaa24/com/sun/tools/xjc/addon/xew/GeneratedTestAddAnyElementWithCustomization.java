package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestAddAnyElementWithCustomization {

    @Test
    public void testAddAnyElementWithCustomization() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        addAnyElement(jClass, element);

        ObjectUtils.assertSame("element", getAnyElement(jClass, annotatable));
    }

}