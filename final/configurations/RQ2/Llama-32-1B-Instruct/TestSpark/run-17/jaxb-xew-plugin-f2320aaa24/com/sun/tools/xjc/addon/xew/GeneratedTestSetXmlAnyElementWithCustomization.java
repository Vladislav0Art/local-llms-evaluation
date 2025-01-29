package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestSetXmlAnyElementWithCustomization {

    @Test
    public void testSetXmlAnyElementWithCustomization() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        addAnnotation(element);

        setXMLAnyElement(jClass, element);

        ObjectUtils.assertSame("element", getXMLAnyElement(jClass, annotatable));
    }

}