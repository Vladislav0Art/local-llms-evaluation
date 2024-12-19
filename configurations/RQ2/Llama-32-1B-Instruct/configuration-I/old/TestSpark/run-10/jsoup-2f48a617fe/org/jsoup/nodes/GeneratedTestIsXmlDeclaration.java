package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    public String nodeName() {
        return "Comment";
    }

    public String getData() {
        return "";
    }

    @Override
    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        accum.append("<!--");
        out.setIndent("  ");
        out.write("<comment>");
    }

    @Override
    public void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
        accum.append("</comment></!--");
    }

    @Override
    public String toString() {
        return "<Comment " + nodeName();
    }

    @Override
    public Comment clone() {
        return new Comment(getData());
    }

    /**
     * Check if this comment looks like an XML Declaration.
     *
     * @return true if it looks like, maybe, it's an XML Declaration.
     */
    public boolean isXmlDeclaration() {
        // This method should be overridden by subclasses
        return false;
    }

    /**
     * Attempt to cast this comment to an XML Declaration node.
     *
     * @return an XML declaration if it could be parsed as one, null otherwise.
     */
    public @Nullable XmlDeclaration asXmlDeclaration() {
        // This method should be implemented in subclasses
        return null;
    }
}

public class CommentImpl extends Comment {

    private String data;

    public CommentImpl(String data) {
        this.data = data;
    }

    @Override
    public String nodeName() {
        return "CommentImpl";
    }

    @Override
    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        accum.append("<!--");
        out.setIndent("  ");
        out.write("<comment>");
        if (data != null && !data.isEmpty()) {
            accum.append(data);
        }
        accum.append("</comment></!--");
    }

    @Override
    public void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
        accum.append("</comment></!--");
    }

    @Override
    public String toString() {
        return "<CommentImpl " + nodeName();
    }
}

public class XmlDeclarationTest {

    private Comment comment;
    private Appendable output;
    private Document document;

    @Before
    public void setUp() {
        comment = new CommentImpl("Example content");
        output = System.out;
        document = new Document(output);
    }

    @Test
    public void testIsXmlDeclaration() {
        comment.setNodeName("Comment");
        assert comment.isXmlDeclaration();
    }

}