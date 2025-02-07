package org.jsoup.nodes;

public class GeneratedTestIsEmpty {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testIsEmpty() {
        Attr.add("test", "value");

        assertTrue(Attr.isEmpty());
    }

}