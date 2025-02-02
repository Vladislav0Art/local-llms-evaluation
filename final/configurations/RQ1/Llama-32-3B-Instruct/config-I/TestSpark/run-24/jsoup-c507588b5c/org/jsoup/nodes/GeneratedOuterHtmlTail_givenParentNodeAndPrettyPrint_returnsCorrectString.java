package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_givenParentNodeAndPrettyPrint_returnsCorrectString {

    @Test
    public void outerHtmlTail_givenParentNodeAndPrettyPrint_returnsCorrectString() throws IOException {
        // Mock parentNode and out
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Element parent = new Element("div");
        TextNode textNode = new TextNode("   Hello World  ");
        document.outerHtmlTail(accum, 0, out);
        String expectedString = "";
        assertEquals(expectedString, accum.toString());
    }

}