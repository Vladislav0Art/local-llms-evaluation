package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoreCase {

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
    public void testHasKeyIgnoreCase() {
        String key = "key9";
        assertTrue(attributes.hasKeyIgnoreCase(key));
    }

}