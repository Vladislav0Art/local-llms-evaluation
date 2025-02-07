package org.jsoup.nodes;

public class GeneratedTestIterator {

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
    public void testIterator() {
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

        Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            Attribute attribute = iterator.next();
            if ((attribute instanceof String && !lowerCase((String) attribute.toLowerCase()).equals("key")) || attribute instanceof String &&
                    !(attribute instanceof null)){
                key = lowerCase(attribute.toLowerCase());
            } else{
                key = "key";
            }
            Object value = null;
            if (iterator.hasNext()) {
                value = iterator.next().getUserData();
            }

            Assert.assertTrue(key.equals(lowerCase((String) key)));
            Assert.assertTrue(value.equals(lowerCase((String) value)));
        }
    }

}