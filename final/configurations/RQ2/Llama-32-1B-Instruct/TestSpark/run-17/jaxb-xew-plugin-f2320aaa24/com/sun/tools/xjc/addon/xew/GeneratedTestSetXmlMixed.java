package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestSetXmlMixed {

    @Test
    public void testSetXmlMixed() {
        JAXBElement element = mock(JAXBElement.class);
        JClass jClass = mock(JClass.class);
        CustomizationUtils.applyCustomization(element, "customization");

        setXMLMixed(jClass, element);

        ObjectUtils.assertSame("element", getXMLMixed(jClass, annotatable));
    }

}