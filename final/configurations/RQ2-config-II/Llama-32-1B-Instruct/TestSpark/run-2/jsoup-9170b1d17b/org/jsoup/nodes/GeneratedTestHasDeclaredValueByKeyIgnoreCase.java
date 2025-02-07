package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueByKeyIgnoreCase {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testHasDeclaredValueByKeyIgnoreCase() {
        Attr.add("test", "value");
        Attr.add("test2", "newValue");

        assertTrue(Attr.attr4.hasDeclaredValueForKeyIgnoreCase("key"));
    }

}