package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_ThrowsIOExceptionIfTextIsBlank {

    @Test
    public void outerHtmlHead_ThrowsIOExceptionIfTextIsBlank() throws IOException {
        assertThrows(IOException.class, () -> {
            Document document = new Document();
            Appendable accum = new StringBuilder();
            int depth = 0;
            Document.OutputSettings out = new Document.OutputSettings(true);
            TextNode textNode = new TextNode("   ");
            textNode.parentNode = document;
            textNode.indent(accum, depth, out);
        });
    }

}