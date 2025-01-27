package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadThrowsIOExceptionWhenAppendableCannotBeWrittenTo {

    @Test
    public void outerHtmlHeadThrowsIOExceptionWhenAppendableCannotBeWrittenTo() throws IOException {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("Hello");
        try {
            textNode.outerHtmlHead(appendable, 0, outputSettings);
            fail("IOException was not thrown");
        } catch (IOException e) {
            // expected
        }
    }

}