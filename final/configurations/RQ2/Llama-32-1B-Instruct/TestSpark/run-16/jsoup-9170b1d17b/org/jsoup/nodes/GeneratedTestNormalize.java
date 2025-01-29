package org.jsoup.nodes;

public class GeneratedTestNormalize {

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
    public void testNormalize() {
        String key = "key";
        Object value = "newValue";

        this.attributes.normalize();
        assertEquals(value, this.attributes.getUserData(key));
    }

}