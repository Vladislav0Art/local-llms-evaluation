package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testGet() {
        String attrKey = "test";
        Attribute attr = new Attr();
        String expectedValue = "test";
        assertEquals(expectedValue, attr.get(attrKey));
    }

    @Test
    public void testGetIgnoreCase() {
        String attrKey = "test";
        Attribute attr = new Attr();
        String expectedValue = "TEST";
        assertEquals(expectedValue, attr.getIgnoreCase(attrKey));
    }

    @Test
    public void testAdd() {
        Attributes attrs = new Attributes();
        String key = "key";
        String value = "value";
        attrs.add(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertEquals(value, attributes.get(0).get(key));
    }

    @Test
    public void testAddWithNull() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.add(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

    @Test
    public void testPut() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = "value";
        attrs.put(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertEquals(value, attributes.get(0).getUserData(key));
    }

    @Test
    public void testPutWithNull() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.put(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

    @Test
    public void testPutUserData() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putUserData(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertEquals(value, attributes.get(0).getUserData(key));
    }

    @Test
    public void testPutWithNullValue() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.put(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

    @Test
    public void testPutIgnoreCase() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

    @Test
    public void testPutWithNullValue() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

    @Test
    public void testPutUserData() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putUserData(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertEquals(value, attributes.get(0).getUserData(key));
    }

    @Test
    public void testPutWithNullValue() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.put(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

    @Test
    public void testPutIgnoreCaseWithNullValue() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        List<Attribute> attributes = attrs.asList();
        assertEquals(1, attributes.size());
        assertNotNull(attributes.get(0).getUserData(key));
    }

    @Test
    public void testRemove() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.remove(key);
        List<Attribute> attributes = attrs.asList();
        assertEquals(0, attributes.size());
    }

    @Test
    public void testRemoveIgnoreCase() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.removeIgnoreCase(key);
        List<Attribute> attributes = attrs.asList();
        assertEquals(0, attributes.size());
    }

    @Test
    public void testHasKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.put(key, value);
        boolean expectedValue = true;
        assertTrue(attrs.hasKey(key));
    }

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        boolean expectedValue = true;
        assertTrue(attrs.containsKeyIgnoreCase(key));
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.put(key, value);
        boolean expectedValue = false;
        assertFalse(attrs.hasDeclaredValueForKey(key));
    }

    @Test
    public void testHasKeyIgnoreCaseForKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        boolean expectedValue = true;
        assertTrue(attrs.containsKeyIgnoreCase(key));
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.putIgnoreCase(key, value);
        boolean expectedValue = false;
        assertFalse(attrs.hasDeclaredValueForKeyIgnoreCase(key));
    }

    @Test
    public void testRemoveWithNullKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.remove(key);
        List<Attribute> attributes = attrs.asList();
        assertEquals(0, attributes.size());
    }

    @Test
    public void testRemoveIgnoreCaseWithNullKey() {
        Attributes attrs = new Attributes();
        String key = "key";
        Object value = null;
        attrs.removeIgnoreCase(key);
        List<Attribute> attributes = attrs.asList();
        assertEquals(0, attributes.size());
    }

}