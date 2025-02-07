package org.jsoup.nodes;

public class GeneratedTestPutAttributeValue {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testPutAttributeValue() {
        Attr.attr2.put("key", "Value");
        assertEquals("Value", attr2.getValue());

        Attr.attr3 = attr2;
        assert attr2 == attr3;

        try {
            Attr.attr4 = new Attr();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}