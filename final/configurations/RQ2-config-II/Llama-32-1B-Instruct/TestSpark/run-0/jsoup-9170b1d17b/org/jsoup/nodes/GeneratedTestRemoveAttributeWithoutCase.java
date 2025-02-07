package org.jsoup.nodes;

public class GeneratedTestRemoveAttributeWithoutCase {

    private Attributes attributes;

    @Test
    public void testRemoveAttributeWithoutCase() {
        String key = "testKey";
        Attribute attribute = new Attributes();
        attributes.remove(StringUtil.lowerCase(key));
        assertNull(attribute);
    }

}