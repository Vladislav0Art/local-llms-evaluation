package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    private static final String COMMENT_DATA = "#comment";
    private String data;

    public Comment(String data) {
        this.data = data;
    }

    @Override
    public boolean nodeName() {
        return COMMENT_DATA.equals(nodeName());
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public Comment setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        if (out.prettyPrint() && ((siblingIndex() == 0 && parentNode instanceof Element && ((Element) parentNode).tag().formatAsBlock()) || (out.outline() > 1)))
            indent(accum, depth, out);
        accum
                .append("<!--")
                .append(getData())
                .append("-->");
    }

    @Override
    public void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
    }

    public String toString() {
        return outerHtml();
    }
}

public class CommentUtils {

    private static boolean isXmlDeclarationData(String data) {
        return (data.length() > 1 && (data.startsWith("!") || data.startsWith("?")));
    }

    @Test
    public void testAsXmlDeclaration() throws Exception {
        String data = "!!!xml declaration";
        Comment mockComment = new Comment(COMMENT_DATA);
        XmlDeclaration xmlDeclaration = (XmlDeclaration) mockComment.asXmlDeclaration();
        assertNotEquals(null, xmlDeclaration);
    }

}