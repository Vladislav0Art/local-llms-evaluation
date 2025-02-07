package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCase {

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
    public void testGetIgnoreCase() {
        String key = "key1";
        String expectedValue = "key1";
        assert attributes.getIgnoreCase(key).equals(expectedValue);
        assertEquals(expectedValue, attributes.getUserData(key));
    }

}