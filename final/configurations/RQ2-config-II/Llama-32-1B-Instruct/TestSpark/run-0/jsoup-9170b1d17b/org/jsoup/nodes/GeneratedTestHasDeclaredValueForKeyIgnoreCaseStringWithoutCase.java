package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCaseStringWithoutCase {

    private Attributes attributes;

    @Test
    public void testHasDeclaredValueForKeyIgnoreCaseStringWithoutCase() {
        String key = "TESTKEY";
        Object value = null;
        attributes.put(StringUtil.lowerCase(key), value);
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase(StringUtil.lowerCase(key)));
    }

}