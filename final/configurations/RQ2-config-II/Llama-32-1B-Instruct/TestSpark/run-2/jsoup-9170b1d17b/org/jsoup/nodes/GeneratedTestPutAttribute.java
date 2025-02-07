package org.jsoup.nodes;

public class GeneratedTestPutAttribute {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testPutAttribute() {
        Attr.put("test", "value");

        assertEquals(1, document.attributes().size());
        assertEquals("test", document.attributes().get(0).getKey());

        try {
            Attr.attr5 = new Attr();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}