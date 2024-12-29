package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testCheckNotNull() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(Attributes.checkNotNull("value"));
        Assert.assertFalse(Attributes.checkNotNull(null));
    }

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        String key = "Key";
        String value = "Value";
        attributes.put(key, value);
        assertEquals(value, attributes.getIgnoreCase(key));
    }

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object userData = "value";
        attributes.putUserData(key, userData);
        Assert.assertTrue(Attributes.getUserData(key).equals(userData));
    }

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.add(key, value);
        assertEquals(value, attributes.get(key));
    }

    @Test
    public void testPut() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = "value";
        attributes.put(key, value);
        assertEquals(value, attributes.getValue(key));
    }

    @Test
    public void testPutUserData() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object userData = "value";
        attributes.putUserData(key, userData);
        assertEquals(userData, attributes.getUserData(key));
    }

    @Test
    public void testAddToArray() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        List<Attribute> attributesList = new ArrayList<>();
        attributesList.add(new AttrUtils.TestAttribute("key", "value"));
        attributes.addAll(attributesList);
        assertEquals(1, attributes.size());
    }

    @Test
    public void testIterator() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.put(key, value);
        Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            assertEquals("key", iterator.next().getKey());
            assertEquals(value, iterator.next().getValue());
        }
    }

    @Test
    public void testToString() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        attributes.put(key, value);
        assertEquals("<AttrUtils>Key=123</AttrUtils>", attributes.toString());
    }

    private static class TestAttribute {

        private final String key;
        private final String value;

        public TestAttribute(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

}