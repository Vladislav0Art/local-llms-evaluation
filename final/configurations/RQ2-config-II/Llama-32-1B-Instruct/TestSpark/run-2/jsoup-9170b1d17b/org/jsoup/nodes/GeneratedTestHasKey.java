package org.jsoup.nodes;

public class GeneratedTestHasKey {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testHasKey() {
        Attr.attr2 = new Attr();
        attr2.put("key", "value");

        assertTrue(attr2.containsKey(key));
    }

}