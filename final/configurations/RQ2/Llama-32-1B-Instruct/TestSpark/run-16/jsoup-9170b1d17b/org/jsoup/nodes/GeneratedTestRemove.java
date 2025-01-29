package org.jsoup.nodes;

public class GeneratedTestRemove {

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
    public void testRemove() {
        String key = "testKey";
        boolean value = true;

        this.attributes.remove(key);
        assertFalse(this.attributes.hasValueForKey(key));

        Assert.assertTrue(this.attributes.isEmpty());
    }

    public void testRemoveIgnoreCase() {
        String key = "key";
        Object value = "newValue";

        this.attributes.removeIgnoreCase(key);
        assertFalse(this.attributes.hasValueForKeyIgnoreCase(key));
    }

}