package org.jsoup.nodes;

public class GeneratedTestAsList {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testAsList() {
        Attr.add("test", "value");
        List<Attribute> attributes = Attr.asList();
        assertEquals(1, attributes.size());

        assertEquals(attr2, attributes.get(0));
    }

}