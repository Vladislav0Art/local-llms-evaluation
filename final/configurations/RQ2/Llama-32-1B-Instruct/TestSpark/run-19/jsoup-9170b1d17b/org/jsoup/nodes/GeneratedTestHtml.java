package org.jsoup.nodes;

public class GeneratedTestHtml {

    private static final Document document = new Document();

    @Test
    public void testHtml() {
        Appendable output = document.body();
        Attributes attributes = new Attributes(document);
        String html = attributes.html(output);
        assertEquals("<p></p>", html);
    }

}