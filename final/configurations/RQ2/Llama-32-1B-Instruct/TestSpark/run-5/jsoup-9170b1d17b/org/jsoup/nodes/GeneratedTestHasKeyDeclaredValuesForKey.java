package org.jsoup.nodes;

public class GeneratedTestHasKeyDeclaredValuesForKey {

    @Test
    public void testHasKeyDeclaredValuesForKey() {
        Attributes attributes = new Attributes();
        String key = "key";
        String[] values = {"value1", "value2"};
        for (String value : values) {
            attributes.put(key, value);
            assertTrue(attributes.hasDeclaredValueForKey(key));
        }
    }

}