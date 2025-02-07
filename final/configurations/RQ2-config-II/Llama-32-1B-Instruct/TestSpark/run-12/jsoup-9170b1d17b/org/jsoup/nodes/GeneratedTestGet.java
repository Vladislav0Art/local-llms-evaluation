package org.jsoup.nodes;

public class GeneratedTestGet {

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
    public void testGet() {
        String expectedValue = "key1";
        assert attributes.get("key1").equals(expectedValue);
        assertEquals(expectedValue, attributes.getUserData("key1"));
    }

}