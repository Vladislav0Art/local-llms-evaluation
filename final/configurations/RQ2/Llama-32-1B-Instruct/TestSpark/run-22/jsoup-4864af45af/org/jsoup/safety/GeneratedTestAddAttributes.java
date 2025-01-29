package org.jsoup.safety;

public class GeneratedTestAddAttributes {

    @Test
    public void testAddAttributes() {
        Safelist safeList = new Safelist();
        safeList.addAttributes("attribute1", "value1", "attribute2");
        assertEquals("attribute1=value1,attribute2", safeList.getEnforcedAttributes("a"));
    }

}