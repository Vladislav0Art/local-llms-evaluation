package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyStringWithoutCase {

    private Attributes attributes;

    @Test
    public void testHasDeclaredValueForKeyStringWithoutCase() {
        String key = "testKey";
        Object value = null;
        attributes.put(StringUtil.lowerCase(key), value);
        assertTrue(attributes.hasDeclaredValueForKey(StringUtil.lowerCase(key)));
    }

}