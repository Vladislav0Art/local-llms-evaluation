package org.jsoup.nodes;

public class GeneratedTestAddAll {

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
    public void testAddAll() {
        String[] keys = {"key1", "key2"};
        Attributes otherAttributes = new Attributes("otherKey");

        for (String key : keys) {
            this.attributes.add(key, otherAttributes);
        }

        List<Attribute> list = Arrays.asList(this.attributes.asList());
        Assert.assertTrue(list.contains(otherAttributes));
    }

}