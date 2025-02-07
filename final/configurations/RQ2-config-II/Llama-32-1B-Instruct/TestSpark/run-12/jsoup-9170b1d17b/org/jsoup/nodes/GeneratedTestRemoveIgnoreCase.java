package org.jsoup.nodes;

public class GeneratedTestRemoveIgnoreCase {

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
    public void testRemoveIgnoreCase() {
        String key = "key6";
        Object value = null;
        attributes.removeIgnoreCase(key, value);
        assert !(attributes.containsKey(key) || !attributes.getUserData(key).equals(value));
    }

}