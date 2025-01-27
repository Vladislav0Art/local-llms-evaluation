package org.jsoup.nodes;

public class GeneratedTestBaseUri {

    public Document document;
    public Parser parser = new Parser();
    public QuirksMode quirksMode;

    @Test
    public void testBaseUri() {
        document = Jsoup.connect("https://example.com").get();
        document.baseUri = "";
    }

}