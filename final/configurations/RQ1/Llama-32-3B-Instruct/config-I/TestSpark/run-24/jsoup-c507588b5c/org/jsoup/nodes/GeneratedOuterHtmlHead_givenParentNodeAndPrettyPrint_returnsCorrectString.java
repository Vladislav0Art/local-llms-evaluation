package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_givenParentNodeAndPrettyPrint_returnsCorrectString {

    @Test
    public void outerHtmlHead_givenParentNodeAndPrettyPrint_returnsCorrectString() throws IOException {
        // Mock parentNode and out
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Element parent = new Element("div");
        TextNode textNode = new TextNode("   Hello World  ");
        document.outerHtmlHead(accum, 0, out);
        String expectedString = "<div><span>   Hello World  </span></div>";
        assertEquals(expectedString, accum.toString());
    }

}