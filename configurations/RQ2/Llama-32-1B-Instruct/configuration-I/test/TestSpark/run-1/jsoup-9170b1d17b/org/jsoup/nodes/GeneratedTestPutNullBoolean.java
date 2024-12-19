package org.jsoup.nodes;

public class GeneratedTestPutNullBoolean {

    @Test
    public void testPutNullBoolean() {
        Attributes attributes = new Attributes();
        assertNull(attributes.put(null, false));
        assertNull(attributes.put("", false));
        assertNull(attributes.put(false, null));
    }

}