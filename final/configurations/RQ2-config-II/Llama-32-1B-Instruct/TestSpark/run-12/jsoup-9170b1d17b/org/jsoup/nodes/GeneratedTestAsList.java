package org.jsoup.nodes;

public class GeneratedTestAsList {

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
    public void testAsList() {
        Attributes otherAttributes = new Attributes();
        for (Object value : otherAttributes.asList()) {
            Object key = null;
            if ((value instanceof String) && !lowerCase(((String) value).toLowerCase()).equals("key")) {
                key = lowerCase(((String) value).toLowerCase());
            } else {
                key = "key";
            }
            otherAttributes.add(key, (String) value);
        }

        List<Attribute> list = attributes.asList();
        Assert.assertEquals(2, list.size());
    }

}