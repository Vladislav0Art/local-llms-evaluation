package org.jsoup.nodes;

public class GeneratedTestHasKeyIgnoreCase {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testHasKeyIgnoreCase() {
        Attr.attr3 = new Attr();
        attr3.put("key", "Value");
        assertEquals(Attr.attr3, attr3);

        assertTrue(attr3.containsKeyIgnoreCase(key));
    }

}