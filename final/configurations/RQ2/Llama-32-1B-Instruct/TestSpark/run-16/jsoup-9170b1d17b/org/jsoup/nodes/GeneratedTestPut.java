package org.jsoup.nodes;

public class GeneratedTestPut {

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
    public void testPut() {
        String key = "key";
        boolean value = true;

        this.attributes.put(key, value);
        assertTrue(this.attributes.hasValueForKey(key));

        Assert.assertFalse(this.attributes.containsKey("key2"));
    }

    public void testPutUserData() {
        Object userData = new Object();
        Object value = "newValue";

        this.attributes.putUserData("key", userData);

        assertEquals(userData, this.attributes.getUserData("key"));

        Assert.assertFalse(this.attributes.containsKey("key2"));
    }

}