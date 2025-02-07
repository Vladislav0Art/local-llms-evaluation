package org.jsoup.nodes;

public class GeneratedTestSize {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testSize() {
        Attr.add("test", "value");
        assertEquals(1, Attr.size());
    }

}