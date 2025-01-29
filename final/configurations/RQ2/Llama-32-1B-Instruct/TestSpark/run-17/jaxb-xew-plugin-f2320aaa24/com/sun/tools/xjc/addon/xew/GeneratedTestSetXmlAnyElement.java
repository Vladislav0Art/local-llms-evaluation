package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestSetXmlAnyElement {

    @Test
    public void testSetXmlAnyElement() {
        JAnnotatable annotatable = mock(JAnnotatable.class);
        JAXBElement element = mock(JAXBElement.class);

        addAnnotation(element);
        addAnnotation(annotatable);

        setXMLAnyElement(jClass, element);

        ObjectUtils.assertSame("element", getXMLAnyElement(jClass, annotatable));
    }

}