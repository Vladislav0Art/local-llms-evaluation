package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testGetString() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get("key"));
        String value = "value";
        attributes.put("key", value);
        assertEquals(value, attributes.get("key"));
    }

    @Test
    public void testGetIgnoreCaseString() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.getIgnoreCase("key"));
        String value = "Value";
        attributes.put("key", value);
        assertEquals(value, attributes.getIgnoreCase("key"));
    }

    @Test
    public void testNullableNotNull() {
        Attributes attributes = new Attributes();
        Object value = "value";
        attributes.putUserData("key", value);
        assertTrue(attributes.checkNotNull(value));
    }

    @Test
    public void testAddString() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void testPutString() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        assertTrue(attributes.hasKey("key"));
        assertEquals(value, attributes.get("key"));
    }

    @Test
    public void testPutAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Object attribute = "attribute";
        attributes.put(attribute);
        assertTrue(attributes.hasDeclaredValueForKey("key"));
        assertEquals("attribute", attributes.getUserData("key"));
    }

    @Test
    public void testRemoveString() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void testRemoveAttribute() {
        Attributes attributes = new Attributes();
        Object attribute = "attribute";
        attributes.put(attribute);
        attributes.remove(attribute);
        assertFalse(attributes.hasDeclaredValueForKey(attribute));
    }

    @Test
    public void testGetAllAttributes() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        Object[] allAttributes = attributes.getAllAttributes();
        assertEquals(1, allAttributes.length);
        assertTrue(Arrays.asList(allAttributes).contains(value));
    }

    @Test
    public void testIterator() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.add("key", value);
        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next().getValue());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testAsList() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        List<Attribute> list = attributes.asList();
        assertEquals(1, list.size());
        assertTrue(list.get(0).getValue().equals(value));
    }

    @Test
    public void testDataset() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        Map<String, String> dataset = attributes.dataset();
        assertEquals(1, dataset.size());
        assertTrue(dataset.containsKey("key"));
        assertEquals(value, dataset.get("key"));
    }

    @Test
    public void testHtml() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        String html = attributes.html();
        assertEquals(value, html);
    }

}