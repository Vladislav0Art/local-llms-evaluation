package com.sun.tools.xjc.addon.xew;

public class GeneratedGetJAXBElementTest {

    @Test
    public void getJAXBElementTest() {
        // Test case: Get JAXB element from a value
        Object value = "value";
        JAXBElement element = JAXBUtil.getJAXBElement(value);
        assertNotNull(element);
    }

}