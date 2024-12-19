package org.jsoup.parser;

public class GeneratedTestGetValueByName {

    @Test
    public void testGetValueByName() {
        Tag value = new TagImpl("p", false);
        assertEquals(value.toString(), getValueByName("p"));
        assertEquals(new TagImpl("P", false), getValueByName("P"));
        assertFalse(getValueByName(null));
    }

}