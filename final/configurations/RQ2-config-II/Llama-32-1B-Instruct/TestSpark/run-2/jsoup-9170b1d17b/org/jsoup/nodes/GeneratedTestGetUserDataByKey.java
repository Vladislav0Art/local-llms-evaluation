package org.jsoup.nodes;

public class GeneratedTestGetUserDataByKey {

    private Document document;
    private Attr attr1, attr2;
    private String key;

    @Before
    public void setUp() {
        document = new Document();
        Attr.init(document);
    }

    @Test
    public void testGetUserDataByKey() {
        Attr.attr1.getUserData("key").setValue("value");
        assertEquals(Attr.attr1.getUserData("key"), "value");

        Attr.attr2.getUserData("key").setValue("newValue");
        assertEquals(Attr.attr2.getUserData("key"), "newValue");
    }

}