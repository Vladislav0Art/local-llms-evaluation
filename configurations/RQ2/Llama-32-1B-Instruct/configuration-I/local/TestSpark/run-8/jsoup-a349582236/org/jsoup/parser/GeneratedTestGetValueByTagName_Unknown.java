package org.jsoup.parser;

public class GeneratedTestGetValueByTagName_Unknown {

    @Test
    public void testGetValueByTagName_Unknown() {
        Tag value = new TagImpl("unknown", false);
        assertEquals("", value.getValueByName("unknown"));
        assertTrue(toString().equals(getValueByName("unknown")));
    }

}