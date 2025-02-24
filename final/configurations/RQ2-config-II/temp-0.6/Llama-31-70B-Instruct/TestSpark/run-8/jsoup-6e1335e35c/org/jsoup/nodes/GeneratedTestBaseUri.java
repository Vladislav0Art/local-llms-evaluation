package org.jsoup.nodes;

public class GeneratedTestBaseUri {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testBaseUri() {
        String uri = "http://example.com";
        element.baseUri(uri);
        assertEquals(uri, element.baseUri());
    }

}