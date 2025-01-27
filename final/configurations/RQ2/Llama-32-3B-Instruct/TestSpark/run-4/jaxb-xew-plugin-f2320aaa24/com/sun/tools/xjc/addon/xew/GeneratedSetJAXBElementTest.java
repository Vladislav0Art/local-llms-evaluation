package com.sun.tools.xjc.addon.xew;

public class GeneratedSetJAXBElementTest {

    @Test
    public void setJAXBElementTest() {
        // Test case: Set JAXB element for a value
        Object value = "value";
        JAXBElement element = new JAXBElement();
        element.set(value);
        assertEquals(value, element.getValue());
    }

}