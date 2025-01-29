package org.jsoup.nodes;

public class GeneratedTestCheckNotNull {

    private Attributes attributes;

    @BeforeEach
    void init() {
        String key = "testKey";
        Object value = "testValue";
        this.attributes = new Attributes("key", value);
    }

    public void testGet(String key) {
        assertEquals(key, this.attributes.get(key));
    }

    public void testGetIgnoreCase(String key) {
        assertEquals(key, this.attributes.getIgnoreCase(key));
    }

    @Test
    public void testCheckNotNull() {
        String value = "testValue";
        String expected = "testValue";

        String actual = Attributes.checkNotNull(value);
        assertEquals(expected, actual);
    }

    public void testAdd() {
        String key = "newKey";
        Object value = "newValue";

        this.attributes.add(key, value);

        Assert.assertTrue(this.attributes.containsKey("newKey"));
        assertEquals(value, this.attributes.getUserData("newKey"));
    }

}