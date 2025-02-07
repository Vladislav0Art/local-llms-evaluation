package org.jsoup.nodes;

public class GeneratedTest {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testGetByKey() {
        attr1 = Attr.add("test", "value");
        attr1.put("key", "value1");

        assertEquals("value1", attr1.get(key));
    }

    @Test
    public void testGetIgnoreCaseByKey() {
        attr2 = Attr.add("test", "value");
        attr2.put("key", "Value1");

        assertEquals("value1", attr2.getIgnoreCase(key));
    }

    @Test
    public void testGetUserDataByKey() {
        Attr.attr1.getUserData("key").setValue("value");
        assertEquals(Attr.attr1.getUserData("key"), "value");

        Attr.attr2.getUserData("key").setValue("newValue");
        assertEquals(Attr.attr2.getUserData("key"), "newValue");
    }

    @Test
    public void testAddAttribute() {
        Attr.add("test", "value");

        assertEquals(1, document.attributes().size());
        assertEquals("test", document.attributes().get(0).getKey());
    }

    @Test
    public void testPutAttributeValue() {
        Attr.attr2.put("key", "Value");
        assertEquals("Value", attr2.getValue());

        Attr.attr3 = attr2;
        assert attr2 == attr3;

        try {
            Attr.attr4 = new Attr();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testPutAttribute() {
        Attr.put("test", "value");

        assertEquals(1, document.attributes().size());
        assertEquals("test", document.attributes().get(0).getKey());

        try {
            Attr.attr5 = new Attr();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRemoveAttribute() {
        Attr.add("test", "value");

        assertTrue(document.attributes().size() == 1);
        assertEquals(0, document.attributes().size());
        assertEquals("test", document.attributes().get(0).getKey());

        Attr.remove("test");
        assertTrue(document.attributes().size() == 0);
    }

    @Test
    public void testRemoveAttributeByKey() {
        Attr.add("test", "value");

        assertTrue(document.attributes().size() == 1);
        assertEquals(0, document.attributes().size());
        assertEquals("test", document.attributes().get(0).getKey());

        Attr.removeByKey("test");
        assertTrue(document.attributes().size() == 0);
    }

    @Test
    public void testHasKey() {
        Attr.attr2 = new Attr();
        attr2.put("key", "value");

        assertTrue(attr2.containsKey(key));
    }

    @Test
    public void testHasKeyIgnoreCase() {
        Attr.attr3 = new Attr();
        attr3.put("key", "Value");
        assertEquals(Attr.attr3, attr3);

        assertTrue(attr3.containsKeyIgnoreCase(key));
    }

    @Test
    public void testHasKey() {
        Attr.attr2 = new Attr();
        attr2.put("key", "value");

        assertTrue(attr2.containsKey(key));
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Attr.add("test", "value");

        assertTrue(Attr.attr3.hasDeclaredValueForKey("key"));
    }

    @Test
    public void testHasDeclaredValueByKeyIgnoreCase() {
        Attr.add("test", "value");
        Attr.add("test2", "newValue");

        assertTrue(Attr.attr4.hasDeclaredValueForKeyIgnoreCase("key"));
    }

    @Test
    public void testSize() {
        Attr.add("test", "value");
        assertEquals(1, Attr.size());
    }

    @Test
    public void testIsEmpty() {
        Attr.add("test", "value");

        assertTrue(Attr.isEmpty());
    }

    @Test
    public void testAddAll() {
        List<Attribute> attributes = new ArrayList<>();
        attributes.add(attr2);
        Attr.addAll(attributes);

        assertEquals(1, document.attributes().size());
        assertEquals(attr2, document.attributes().get(0));
    }

    @Test
    public void testIterator() {
        Attr.attr2 = new Attr();
        attr2.put("key", "value");

        Iterator<Attribute> iterator = Attr.iterator();

        while (iterator.hasNext()) {
            assertTrue(iterator.hasNext());
        }
    }

    @Test
    public void testAsList() {
        Attr.add("test", "value");
        List<Attribute> attributes = Attr.asList();
        assertEquals(1, attributes.size());

        assertEquals(attr2, attributes.get(0));
    }

    @Test
    public void testDataset() {
        Attr.add("test", "value");

        Map<String, String> map = Attr.dataset();

        assertEquals("test", map.get("key"));
    }

}