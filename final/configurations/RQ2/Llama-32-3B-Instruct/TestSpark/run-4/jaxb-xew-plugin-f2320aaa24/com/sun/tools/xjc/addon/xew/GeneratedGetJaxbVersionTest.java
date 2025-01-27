package com.sun.tools.xjc.addon.xew;

public class GeneratedGetJaxbVersionTest {

    @Test
    public void getJaxbVersionTest() {
        // Test case: Get JAXB version from options
        Options options = new Options();
        String jaxbVersion = options.getJaxbVersion();
        assertNotNull(jaxbVersion);
    }

}