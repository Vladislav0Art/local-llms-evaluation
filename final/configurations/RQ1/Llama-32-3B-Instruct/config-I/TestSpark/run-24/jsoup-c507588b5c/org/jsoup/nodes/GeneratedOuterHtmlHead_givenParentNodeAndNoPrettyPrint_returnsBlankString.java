package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_givenParentNodeAndNoPrettyPrint_returnsBlankString {

    @Test
    public void outerHtmlHead_givenParentNodeAndNoPrettyPrint_returnsBlankString() throws IOException {
        // Mock parentNode and out
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Element parent = new Element("div");
        TextNode textNode = new TextNode("   Hello World  ");
        document.outerHtmlHead(accum, 0, out);
        String expectedString = "";
        assertEquals(expectedString, accum.toString());
    }

}