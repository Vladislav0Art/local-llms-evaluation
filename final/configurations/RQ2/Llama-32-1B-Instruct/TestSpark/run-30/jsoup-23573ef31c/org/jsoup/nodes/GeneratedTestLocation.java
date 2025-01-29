package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestLocation {

    public String connection() {
        return "Jsoup Node";
    }

    @Before
    public void setup() {
        JsoupNode.main(new String[]{"JsoupNode", "Connection"});
    }
}

public class DocumentTest {
    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testLocation() {
        assertEquals("http://example.com", document.location());
    }

}