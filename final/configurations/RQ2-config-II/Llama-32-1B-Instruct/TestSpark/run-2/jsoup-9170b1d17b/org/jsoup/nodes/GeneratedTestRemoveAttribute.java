package org.jsoup.nodes;

public class GeneratedTestRemoveAttribute {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testRemoveAttribute() {
        Attr.add("test", "value");

        assertTrue(document.attributes().size() == 1);
        assertEquals(0, document.attributes().size());
        assertEquals("test", document.attributes().get(0).getKey());

        Attr.remove("test");
        assertTrue(document.attributes().size() == 0);
    }

}