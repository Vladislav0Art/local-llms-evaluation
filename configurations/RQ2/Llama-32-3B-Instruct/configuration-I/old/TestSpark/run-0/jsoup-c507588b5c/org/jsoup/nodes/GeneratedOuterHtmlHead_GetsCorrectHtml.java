package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_GetsCorrectHtml {

    @Test
    public void outerHtmlHead_GetsCorrectHtml() {
        // given
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");

        // when
        try {
            textNode.outerHtmlHead(accum, 0, out);
        } catch (IOException e) {
            fail("IOException expected");
        }

        // then
        String html = accum.toString();
        assertEquals("<html><body>Hello World</body></html>", html);
    }

}