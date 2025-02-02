package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;

public class GeneratedTestIsXmlDeclarationReturnsFalseIfDataDoesNotStartWithSlashOrQuestionMark {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    }

    @Test
    public void testIsXmlDeclarationReturnsFalseIfDataDoesNotStartWithSlashOrQuestionMark() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertFalse(comment.isXmlDeclaration());
    }
}

class Comment {
    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public static String getNodeName(Comment comment) {
        return comment.getData();
    }

    public static Comment setData(Comment comment, String data) {
        comment.setData(data);
        return comment;
    }

    public void outerHtmlHead(Appendable accum) {
        // implementation
    }

    public void outerHtmlTail(Appendable accum) {
        // implementation
    }

    public String toString() {
        // implementation
    }

    public Comment clone() {
        // implementation
    }

    public boolean isXmlDeclaration() {
        return data.startsWith("!") && data.indexOf('?') != -1;
    }

    private void setData(String data) {
        this.data = data;
    }

}