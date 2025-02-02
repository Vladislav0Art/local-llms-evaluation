package org.jsoup.nodes;

public class GeneratedTestCommentNode {

    private String data;
    private boolean isXmlDeclaration;

    public CommentNode(String data) {
        this.data = data;
        isXmlDeclaration = true;
    }

    @Override
    public String toString() {
        return "#comment=" + data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isXmlDeclaration() {
        return isXmlDeclaration;
    }

    public void setXmlDeclaration(boolean xmlDeclaration) {
        isXmlDeclaration = xmlDeclaration;
    }
}

public class XmlDeclaration {
    private String text;

    public XmlDeclaration(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "<!--This is an XML Declaration-->" + text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

public class CommentWithDeclNode {
    private CommentNode comment;
    private XmlDeclaration decl;

    public CommentWithDeclNode(CommentNode comment, XmlDeclaration decl) {
        this.comment = comment;
        this.decl = decl;
    }

    @Override
    public String toString() {
        return comment.toString() + " " + decl.toString();
    }

    public CommentNode getComment() {
        return comment;
    }

    public void setComment(CommentNode comment) {
        this.comment = comment;
    }

    public XmlDeclaration getDecl() {
        return decl;
    }

    public void setDecl(XmlDeclaration decl) {
        this.decl = decl;
    }
}

public class CommentNodeTest {

    @Test
    public void testCommentNode() {
        CommentNode comment = new CommentNode("This is a comment");
        assertEquals("#comment=This is a comment", comment.toString());
        assertEquals("This is a comment", comment.getData());
        assertTrue(comment.isXmlDeclaration());
        assertFalse(comment.asXmlDeclaration());
        assertNull(comment.asXmlDeclaration());
    }

}