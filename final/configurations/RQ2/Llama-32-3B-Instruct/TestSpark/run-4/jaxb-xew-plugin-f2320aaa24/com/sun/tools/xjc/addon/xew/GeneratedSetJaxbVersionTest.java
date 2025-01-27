package com.sun.tools.xjc.addon.xew;

public class GeneratedSetJaxbVersionTest {

    @Test
    public void setJaxbVersionTest() {
        // Test case: Set JAXB version for options
        Options options = new Options();
        String jaxbVersion = "2.3";
        options.setJaxbVersion(jaxbVersion);
        assertEquals(jaxbVersion, options.getJaxbVersion());
    }
}

}