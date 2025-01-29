package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCase_ReturnsFalseForNonDeclaredValues {

    private Attributes attributes;

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase_ReturnsFalseForNonDeclaredValues() {
        String key = "key1";
        String value = "";
        attributes.put(userData(key), value);
        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase(key));
    }

}