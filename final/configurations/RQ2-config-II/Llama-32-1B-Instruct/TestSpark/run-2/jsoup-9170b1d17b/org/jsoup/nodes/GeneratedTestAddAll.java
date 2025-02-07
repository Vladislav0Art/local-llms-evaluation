package org.jsoup.nodes;

public class GeneratedTestAddAll {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testAddAll() {
        List<Attribute> attributes = new ArrayList<>();
        attributes.add(attr2);
        Attr.addAll(attributes);

        assertEquals(1, document.attributes().size());
        assertEquals(attr2, document.attributes().get(0));
    }

}