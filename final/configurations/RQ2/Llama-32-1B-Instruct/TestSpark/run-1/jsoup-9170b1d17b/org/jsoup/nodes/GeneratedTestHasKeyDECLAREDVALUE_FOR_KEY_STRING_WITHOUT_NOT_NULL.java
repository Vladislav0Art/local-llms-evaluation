package org.jsoup.nodes;

public class GeneratedTestHasKeyDECLAREDVALUE_FOR_KEY_STRING_WITHOUT_NOT_NULL {

    @Test
    public void testHasKeyDECLAREDVALUE_FOR_KEY_STRING_WITHOUT_NOT_NULL() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals(false, attributes.containsKey("declare_value_key"));
    }

}