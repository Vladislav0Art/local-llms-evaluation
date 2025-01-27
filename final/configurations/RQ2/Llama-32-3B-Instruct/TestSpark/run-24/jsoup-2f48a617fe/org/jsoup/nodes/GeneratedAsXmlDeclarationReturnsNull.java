package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedAsXmlDeclarationReturnsNull {

    @Test
    public void asXmlDeclarationReturnsNull() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }
}

public class Comment {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String nodeName() {
        return "Comment";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    public Comment clone() {
        return new Comment(this.data);
    }

    public void outerHtmlHead(Appendable text, int depth, Document.OutputSettings out) {

    }

    public void outerHtmlTail(Appendable text, int depth, Document.OutputSettings out) {

    }
}

public class Document {

    public static class OutputSettings {
        // settings for output
    }

}