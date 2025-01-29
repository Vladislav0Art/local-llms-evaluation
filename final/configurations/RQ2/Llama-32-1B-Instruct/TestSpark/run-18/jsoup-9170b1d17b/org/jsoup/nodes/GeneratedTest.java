package org.jsoup.nodes;

public class GeneratedTest {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testGet() {
        String key = "testKey";
        String expectedValue = "testValue";
        Attribute attribute = document.createAttribute(key);
        attribute.setText(expectedValue);

        assertEquals(expectedValue, get(key));
    }

    @Test
    public void testGetIgnoreCase() {
        String key = "testKey";
        String expectedValue = "testValue";
        Attribute attribute = document.createAttribute(key);
        attribute.setText(expectedValue);

        assertEquals(expectedValue, getIgnoreCase(key));
    }

    @Test
    public void test

    GetNullValue() {
        String key = "testKey";
        assertEquals(null, getUserData(key));
    }

    @Test
    public void testAdd() {
        String key = "testKey";
        Attribute attribute = document.createAttribute(key);
        attribute.setText("testValue");
        add(attribute);

        assertEquals(1, getKeys().size());
        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

    @Test
    public void testAddMultiple() {
        String key1 = "testKey1";
        String key2 = "testKey2";
        Attribute attribute1 = document.createAttribute(key1);
        attribute1.setText("testValue1");
        add(attribute1);

        String key3 = "testKey3";
        String key4 = "testKey4";

        Attribute attribute2 = document.createAttribute(key2);
        attribute2.setText("testValue2");
        add(attribute2);

        assertEquals(2, getKeys().size());
        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

    @Test
    public void testAddAttribute() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        attribute1.setText("testValue1");
        add(attribute1);

        assertEquals(1, getKeys().size());
        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

    @Test
    public void testPut() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        attribute1.setText("testValue1");
        put(attribute1);

        assertEquals(1, getKeys().size());
        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

    @Test
    public void testPutMultiple() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        attribute1.setText("testValue1");
        put(attribute1);

        String key2 = "testKey2";
        Attribute attribute2 = document.createAttribute(key2);
        attribute2.setText("testValue2");
        put(attribute2);

        assertEquals(2, getKeys().size());
    }

    @Test
    public void testPutAttribute() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        attribute1.setText("testValue1");
        put(attribute1);

        assertEquals(1, getKeys().size());
        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

    @Test
    public void testPutValue() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        add(attribute1);

        assertEquals(1, getKeys().size());

        assertEquals("testValue1", getKeyValues().get(0).getValue());
    }

    @Test
    public void testPutValueMultiple() {
        String key1 = "testKey1";
        Attribute attribute1 = document.createAttribute(key1);
        add(attribute1);

        String key2 = "testKey2";
        Attribute attribute2 = document.createAttribute(key2);
        add(attribute2);

        assertEquals(2, getKeys().size());

        assertEquals("testValue1", getKeyValues().get(0).getValue());
    }

    @Test
    public void testPutIgnoreCase() {
        String key1 = "TESTKEY";
        Attribute attribute1 = document.createAttribute(key1);
        add(attribute1);

        assertEquals(1, getKeys().size());

        assertEquals("testValue1", getKeyValues().get(0).getValue());
    }

    @Test
    public void testPutIgnoreCase() {
        String key = "testKey";
        Attribute attribute = document.createAttribute(key);
        attribute.setText("testValue");
        put(attribute);

        assertEquals(1, getKeys().size());

        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

    @Test
    public void testPutIgnoreCaseIgnoreCase() {
        String key = "TESTKEY";
        Attribute attribute = document.createAttribute(key);
        attribute.setText("testValue");
        put(attribute);

        assertEquals(1, getKeys().size());

        assertEquals(expectedValue, getKeyValues().get(0).getValue());
    }

    @Test
    public void testAddAll() {
        Attributes attributes = new Attributes();
        add(attributes);
        assertEquals(1, getKeys().size());
        assertEquals("testValue", getKeyValues().get(0).getValue());
    }

    @Test
    public void testGetKeys() {
        Attributes attributes = new Attributes();
        add(attributes);

        Assert.assertTrue(getKeys().containsAll(Arrays.asList(document.getAllElements())));
    }

    @Test
    public void testGetKeyValues() {
        Attributes attributes = new Attributes();
        add(attributes);
        List<Map<String, Object>> expectedValues = Collections.singletonList(Collections.singletonMap("testValue", "testValue"));
        assertEquals(expectedValues.get(0), getKeyValues());
    }

}