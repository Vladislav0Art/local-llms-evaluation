package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKey_ReturnsFalseForNonDeclaredValues {

    private Attributes attributes;

    @Test
    public void testHasDeclaredValueForKey_ReturnsFalseForNonDeclaredValues() {
        String key = "key1";
        Object value = null;
        attributes.putUserData(key, value);
        assertFalse(attributes.hasDeclaredValueForKey(key));
    }

}