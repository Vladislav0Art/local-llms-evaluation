package org.jsoup.parser;

public class GeneratedTestGetValueByTagName {

    @Test
    public void testGetValueByTagName() {
        Tag value = new TagImpl("p", true);
        assertEquals(toString(), value.getValueByName("p"));
        assertEquals(new TagImpl("P", true), getValueByName("P"));
        assertFalse(getValueByName(null));
    }

    private String toString() {
        return "<" + name + ">";
    }

}