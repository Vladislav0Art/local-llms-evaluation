package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestSetXmlType {

    @Test
    public void testSetXmlType() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        addAnnotation(element);

        setXMLType(jClass, element);

        ObjectUtils.assertSame("element", getXMLType(jClass, annotatable));
    }

}