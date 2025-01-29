package org.jsoup.nodes;

public class GeneratedTest {

    private static final Document document = new Document();

    @Test
    public void testGet() {
        String key = "test";
        String value = "Hello, World!";
        Attributes attributes = new Attributes(document);
        assertEquals(value, attributes.get(key));
    }

    @Test
    public void testGetIgnoreCase() {
        String key = "test";
        String value = "Hello, World!";
        Attributes attributes = new Attributes(document);
        assertEquals(value, attributes.getIgnoreCase(key));
    }

    @Test
    public void testGetValueAsString() {
        String key = "test";
        String value = "Hello, World!";
        Attributes attributes = new Attributes(document);
        assertEquals(value.toString(), attributes.getValue(key));
    }

    @Test
    public void testGetValueAsAttribute() {
        String key = "test";
        String value = "Hello, World!";
        Attributes attributes = new Attributes(document);
        assertEquals(Attributes.class, attributes.getType());
        assertTrue(attributes.getValue(key) instanceof Attribute);
    }

    @Test
    public void testHasKey() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        assertFalse(attributes.hasKey(key));
        attributes.put("key", "value");
        assertTrue(attributes.hasKey(key));
    }

    @Test
    public void testHasKeyIgnoreCase() {
        String key = "TEST";
        Attributes attributes = new Attributes(document);
        assertFalse(attributes.hasKeyIgnoreCase(key));
        attributes.put("key", "value");
        assertTrue(attributes.hasKeyIgnoreCase(key));
    }

    @Test
    public void testHasKey() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        assertFalse(attributes.hasKey(key));
        attributes.add("key", "value");
        assertTrue(attributes.hasKey(key));
    }

    @Test
    public void testHasDeclaredValueForKey() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        attributes.put("key", "value");
        assertFalse(attributes.hasDeclaredValueForKey(key));
        attributes.add("key", "value2");
        assertTrue(attributes.hasDeclaredValueForKey(key));
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        String key = "TEST";
        Attributes attributes = new Attributes(document);
        attributes.put("key", "value");
        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase(key));
        attributes.add("key", "value2");
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase(key));
    }

    @Test
    public void testSize() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        assertEquals(0, attributes.size());
        attributes.put("key1", "value1");
        assertEquals(1, attributes.size());
    }

    @Test
    public void testIsEmpty() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        assertTrue(attributes.isEmpty());
        attributes.add("key1", "value1");
        assertFalse(attributes.isEmpty());
    }

    @Test
    public void testAddAll() {
        List<Attribute> attributesList = new ArrayList<>();
        attributesList.add(new Attribute("attribute1"));
        String key = "test";
        Attributes attributes = new Attributes(document);
        attributes.addAll(attributesList);
        assertEquals(2, attributes.size());

        Attribute attribute = new Attribute("attribute2");
        attributes.add(attribute);

        for (Attribute a : attributes) {
            assertTrue(a != null);
        }
    }

    @Test
    public void testIterator() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        Iterator<Attribute> iterator = attributes.iterator();
        assertEquals(0, iterator.hasNext());
        assertFalse(iterator.hasNext());

        for (int i = 1; i <= attributes.size(); i++) {
            assertTrue(attributes.get(i) != null);
        }
    }

    @Test
    public void testAsList() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        List<Attribute> attributesList = new ArrayList<>();
        attributesList.add(new Attribute("attribute1"));
        attributesList.add(new Attribute("attribute2"));
        String value = "value";
        for (int i = 0; i < attributes.size(); i++) {
            assertTrue(attributes.get(i) != null);
            assertEquals(value, attributes.get(i).getValue(key));
        }
    }

    @Test
    public void testDataset() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        Map<String, String> dataset = new AbstractMap<>();
        dataset.put("key1", "value1");
        attributes.dataset(dataset);
        assertEquals(1, attributes.size());
        assertEquals(dataset.get("key1"), attributes.dataset().get("key1"));
    }

    @Test
    public void testHtml() {
        Appendable output = document.body();
        Attributes attributes = new Attributes(document);
        String html = attributes.html(output);
        assertEquals("<p></p>", html);
    }

    @Test
    public void testNormalize() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        attributes.normalize();
        assertTrue(attributes.isEmpty());
    }

}