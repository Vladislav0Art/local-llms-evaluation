package org.jsoup.nodes;

public class GeneratedTestPutAttributeNotNull {

    @Test
    public void testPutAttributeNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";

        attributes.put(attributes.deduplicate(ParseSettings.of()), key, value);

        assertEquals(value, attributes.getUserData(key));
    }

}