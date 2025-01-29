package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestSetXmlSchema {

    @Test
    public void testSetXmlSchema() {
        JAXBElement element = mock(JAXBElement.class);
        CustomizationUtils.applyCustomization(element, "customization");

        addAnnotation(element);

        setXMLSchema(jClass, element);

        ObjectUtils.assertSame("element", getXMLSchema(jClass, annotatable));
    }

}