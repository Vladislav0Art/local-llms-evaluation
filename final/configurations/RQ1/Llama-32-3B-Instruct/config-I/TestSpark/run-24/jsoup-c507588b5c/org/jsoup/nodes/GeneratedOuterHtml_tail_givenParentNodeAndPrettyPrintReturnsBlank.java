package org.jsoup.nodes;

public class GeneratedOuterHtml_tail_givenParentNodeAndPrettyPrintReturnsBlank {

    @Test
    public void outerHtml_tail_givenParentNodeAndPrettyPrintReturnsBlank() {
        // Mock parentNode and out
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Element parent = new Element("div");
        TextNode textNode = new TextNode("");
        document.outerHtmlTail(accum, 0, out);
        String expectedString = "";
        assertEquals(expectedString, accum.toString());
    }

}