package org.jsoup.nodes;

public class GeneratedTestGetIgnoreCaseByKey {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testGetIgnoreCaseByKey() {
        attr2 = Attr.add("test", "value");
        attr2.put("key", "Value1");

        assertEquals("value1", attr2.getIgnoreCase(key));
    }

}