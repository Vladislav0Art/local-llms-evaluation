package org.jsoup.nodes;

public class GeneratedTestGetNullableValue {

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
    public void testGetNullableValue() {
        Object value = null;
        assert attributes.get("key2").isPresent();
        String expectedValue = null;
        assert !(attributes.get("key2") == null && (value != null || !attributes.get("key1").isEmpty()));
        assertEquals(expectedValue, attributes.getUserData("key2"));
    }

}