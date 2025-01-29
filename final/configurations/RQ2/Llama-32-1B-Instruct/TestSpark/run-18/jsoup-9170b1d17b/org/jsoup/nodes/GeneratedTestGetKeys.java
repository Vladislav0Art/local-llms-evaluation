package org.jsoup.nodes;

public class GeneratedTestGetKeys {

    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testGetKeys() {
        Attributes attributes = new Attributes();
        add(attributes);

        Assert.assertTrue(getKeys().containsAll(Arrays.asList(document.getAllElements())));
    }

}