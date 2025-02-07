package org.jsoup.nodes;

public class GeneratedTestNormalize {

    private Attributes attributes;

    @BeforeEach
    public void setup() {
        String[] keys = {"key1", "key2"};
        Map<String, Object> userData = new HashMap<>();
        userData.put("value1", "val1");
        attributes = new Attributes();
        for (String key : keys) {
            attributes.add(key, null);
            attributes.putUserData(key, userData.get(key));
        }
    }

    @Test
    public void testNormalize() {
        String expectedValue = "";
        attributes.normalize();
        assertEquals(expectedValue, attributes.toString());
    }

}