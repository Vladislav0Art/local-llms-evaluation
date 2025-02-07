package org.jsoup.nodes;

public class GeneratedTestAsList {

    @Test
    public void testAsList() {
        Attributes attributes = new Attributes();
        String[] keys = {"key1", "key2"};
        List<Attribute> list = attributes.asList();
        assertEquals(keys.length, list.size());
    }

    private Attribute attribute1;
    private Attribute attribute2;

    @Before
    public void setup() {
        // do nothing
    }

}