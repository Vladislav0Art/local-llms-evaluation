package org.jsoup.nodes;

public class GeneratedTestIterator {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testIterator() {
        Attr.attr2 = new Attr();
        attr2.put("key", "value");

        Iterator<Attribute> iterator = Attr.iterator();

        while (iterator.hasNext()) {
            assertTrue(iterator.hasNext());
        }
    }

}