package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestSetXmlAnyElementMultiple {

    @Test
    public void testSetXmlAnyElementMultiple() {
        JAXBElement element1 = mock(JAXBElement.class);
        JAXBElement element2 = mock(JAXBElement.class);

        addAnnotation(element1);
        addAnnotation(element2);

        setXMLAnyElement(jClass, element1, element2);

        ObjectUtils.assertSame("element", getXMLAnyElement(jClass, annotatable));
    }

}