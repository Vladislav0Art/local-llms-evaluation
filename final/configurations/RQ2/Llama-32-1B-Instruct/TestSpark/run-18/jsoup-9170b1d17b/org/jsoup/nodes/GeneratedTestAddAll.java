package org.jsoup.nodes;

public class GeneratedTestAddAll {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testAddAll() {
        Attributes attributes = new Attributes();
        add(attributes);
        assertEquals(1, getKeys().size());
        assertEquals("testValue", getKeyValues().get(0).getValue());
    }

}