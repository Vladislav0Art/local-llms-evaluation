package org.jsoup.safety;

public class GeneratedTestAddEnforcedAttribute {

    @Test
    public void testAddEnforcedAttribute() {
        Safelist safeList = new Safelist();
        safeList.addEnforcedAttribute("attribute1", "value1", "attribute2");
        assertEquals("attribute1=value1,attribute2", safeList.getEnforcedAttributes("a"));
    }

}