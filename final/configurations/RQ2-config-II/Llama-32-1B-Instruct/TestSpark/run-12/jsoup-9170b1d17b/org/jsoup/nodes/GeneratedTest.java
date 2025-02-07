package org.jsoup.nodes;

public class GeneratedTest {

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

    @Test
    public void testGetIgnoreCase() {
        String key = "key1";
        String expectedValue = "key1";
        assert attributes.getIgnoreCase(key).equals(expectedValue);
        assertEquals(expectedValue, attributes.getUserData(key));
    }

    @Test
    public void testGetNullableValue() {
        Object value = null;
        assert attributes.get("key2").isPresent();
        String expectedValue = null;
        assert !(attributes.get("key2") == null && (value != null || !attributes.get("key1").isEmpty()));
        assertEquals(expectedValue, attributes.getUserData("key2"));
    }

    @Test
    public void testGetIgnoreCaseNullableValue() {
        Object value = null;
        String expectedValue = null;
        assert !(attributes.getIgnoreCase("key2") == null && (value != null || !attributes.get("key1").isEmpty()));
        assertEquals(expectedValue, attributes.getUserData("key2"));
    }

    @Test
    public void testAdd() {
        String key = "key3";
        Object value = "val3";
        attributes.add(key, value);
        assert !(attributes.containsKey(key) || !attributes.getUserData(key).equals(value));
    }

    @Test
    public void testPutUserData() {
        String key = "key4";
        Object value = new ArrayList<>();
        attributes.putUserData(key, value);
        assert !(attributes.containsKey(key) || !attributes.getUserData(key).equals(value));
    }

    @Test
    public void testRemove() {
        String key = "key5";
        attributes.remove(key);
        assert !attributes.containsKey(key);
    }

    @Test
    public void testRemoveIgnoreCase() {
        String key = "key6";
        Object value = null;
        attributes.removeIgnoreCase(key, value);
        assert !(attributes.containsKey(key) || !attributes.getUserData(key).equals(value));
    }

    @Test
    public void testHasKey() {
        String key = "key7";
        assertTrue(attributes.hasKey(key));
    }

    @Test
    public void testHasDeclaredValueForKey() {
        String key = "key8";
        assertFalse(attributes.hasMoreDeclaredValueForKey(key));
    }

    @Test
    public void testHasKeyIgnoreCase() {
        String key = "key9";
        assertTrue(attributes.hasKeyIgnoreCase(key));
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        String key = "key10";
        assertFalse(attributes.hasMoreDeclaredValueForKeyIgnoreCase(key));
    }

    @Test
    public void testSize() {
        assertEquals(0, attributes.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void testAddAll() {
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
        for (Object key : otherAttributes.keySet()) {
            Object value = null;
            if ((value instanceof String) && !lowerCase((String) value.toLowerCase()).equals("key")) {
                key = lowerCase((String) value.toLowerCase());
            } else {
                key = "key";
            }
            attributes.addAll(otherAttributes);
        }
        assertEquals(2, attributes.size());
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

    @Test
    public void testNormalize() {
        String expectedValue = "";
        attributes.normalize();
        assertEquals(expectedValue, attributes.toString());
    }

}