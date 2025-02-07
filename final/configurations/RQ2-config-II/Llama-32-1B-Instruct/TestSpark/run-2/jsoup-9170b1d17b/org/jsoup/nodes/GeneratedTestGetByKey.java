package org.jsoup.nodes;

public class GeneratedTestGetByKey {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testGetByKey() {
        attr1 = Attr.add("test", "value");
        attr1.put("key", "value1");

        assertEquals("value1", attr1.get(key));
    }

}