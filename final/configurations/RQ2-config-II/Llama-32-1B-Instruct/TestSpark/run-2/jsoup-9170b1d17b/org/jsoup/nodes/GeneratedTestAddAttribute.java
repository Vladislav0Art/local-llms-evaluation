package org.jsoup.nodes;

public class GeneratedTestAddAttribute {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testAddAttribute() {
        Attr.add("test", "value");

        assertEquals(1, document.attributes().size());
        assertEquals("test", document.attributes().get(0).getKey());
    }

}