package org.jsoup.nodes;

public class GeneratedTest {

    private Attributes attributes;

    @Test
    public void testIndexOfKey_ReturnsPosition() {
        attributes = new Attributes();
        assertEquals(0, attributes.indexOfKey("key1"));
        assertEquals(-1, attributes.indexOfKey(""));
    }

    @Test
    public void testIndexOfKey_EmptyString_ThrowsIndexOutOfBoundsException() {
        assertEquals(-1, attributes.indexOfKey("key1"));
    }

    @Test
    public void testIndexOfKey_NullValue_ReturnsPosition() {
        attributes = new Attributes();
        assertEquals(0, attributes.indexOfKey(null));
    }

    @Test
    public void testCheckNotNull_EmptyString_ThrowsException() {
        assertThrows(StringNullChecker.class, () -> attributes.checkNotNull(""));
    }

    @Test
    public void testGet_ReturnsAttribute() {
        String key = "key1";
        Object value = "value1";
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

    @Test
    public void testGetIgnoreCase_ReturnsAttribute() {
        String key = "key1";
        String value = "value1";
        attributes.put(key, value);
        assertEquals(value, attributes.getIgnoreCase(key));
    }

    @Test
    public void testgetUserData_ReturnsNullableValue() {
        String key = "key1";
        Object value = null;
        attributes.putUserData(key, value);
        assertEquals(value, attributes.getUserData(key));
    }

    @Test
    public void testAdd_AddsAttributeToAttributes() {
        Attributes newAttributes = new Attributes();
        newAttributes.add("key2", "value2");
        assertEquals(1, attributes.size());
        assertTrue(attributes.containsValue("key2"));
    }

    @Test
    public void testPut_UpdatesAttribute() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

    @Test
    public void testRemove_RemovesAttribute() {
        String key = "key1";
        attributes.remove(key);
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void testRemoveIgnoreCase_RemovesAttribute() {
        String key = "key1";
        attributes.removeIgnoreCase(key);
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void testHasKey_ReturnsTrueForExistingAttributes() {
        String key = "key1";
        attributes.put("key2", "value2");
        assertTrue(attributes.hasKey(key));
    }

    @Test
    public void testHasDeclaredValueForKey_ReturnsFalseForNonDeclaredValues() {
        String key = "key1";
        Object value = null;
        attributes.putUserData(key, value);
        assertFalse(attributes.hasDeclaredValueForKey(key));
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase_ReturnsFalseForNonDeclaredValues() {
        String key = "key1";
        String value = "";
        attributes.put(userData(key), value);
        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase(key));
    }

    @Test
    public void testSize_ReturnsAttributeCount() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        assertEquals(1, attributes.size());
    }

    @Test
    public void testIsEmpty_ReturnsFalseForNonEmptyAttributes() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        assertFalse(attributes.isEmpty());
    }

    @Test
    public void testAddAll_AddsAttributesToAttributes() {
        Attributes newAttributes = new Attributes();
        newAttributes.add("key2", "value2");
        assertEquals(1, attributes.size());
        assertTrue(newAttributes.containsValue("key2"));
    }

    @Test
    public void testIterator_ReturnsAttributesIterator() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        Iterator<Attribute> iterator = attributes.iterator();
        assertNotNull(iterator);
        while (iterator.hasNext()) {
            Attribute attribute = iterator.next();
            assertTrue(attribute instanceof Attribute);
        }
    }

    @Test
    public void testAsList_ReturnsAttributesList() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        List<Attribute> list = attributes.asList();
        assertEquals(1, list.size());
        assertTrue(list.containsValue("value1"));
    }

    @Test
    public void testDataset_ReturnsAttributesMap() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        Map<String, String> map = attributes.dataset();
        assertNotNull(map);
        assertEquals(1, map.size());
        assertTrue(map.containsKey("value1"));
    }

    @Test
    public void testHtml_ReturnsString() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        String string = attributes.html(null);
        assertNotNull(string);
    }

    @Test
    public void testNormalize_UpdatesAttributeData() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        assertTrue(attributes.normalize());
        assertEquals(value, attributes.get(key));
    }

}