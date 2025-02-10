package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        String text = "<p>Hello</p>";
        Document document = new Document();
        Appendable accum = document.append(null, 0);
        outerHtmlHead(accum, 0, document.OutputSettings.PRETTY_PRINT);

        assertEquals("<p>Hello</p>", getInnerText(document, null));
    }

}