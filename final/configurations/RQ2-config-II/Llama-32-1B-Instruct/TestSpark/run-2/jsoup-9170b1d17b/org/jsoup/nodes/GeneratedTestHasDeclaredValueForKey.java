package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKey {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Attr.add("test", "value");

        assertTrue(Attr.attr3.hasDeclaredValueForKey("key"));
    }

}