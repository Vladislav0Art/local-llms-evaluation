package org.jsoup.nodes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;

public class GeneratedTest {

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

    public Document.Document.OutputSettings getOutputSettings() {
        return null;
    }
}

public class Document {

    public static class OutputSettings {
        // settings for output
    }

    public static class OutputSettings {
        // settings for output
    }
}

import org.junit.Test;
import java.io.ByteArrayOutputStream;

public class CommentTest {

    @Test
    public void newNodeComment() {
        Comment comment = new Comment("");
        assert comment != null;
    }

    @Test
    public void asXmlDeclarationReturnsNull() {
        Comment comment = new Comment("");
        assert comment.asXmlDeclaration() == null;
    }

    @Test
    public void newNodeComment() {
        Comment comment = new Comment("");
        assertNotNull(comment);
    }

    @Test
    public void nodeNameIsComment() {
        Comment comment = new Comment("");
        assertEquals("", comment.nodeName());
    }

    @Test
    public void getDataReturnsString() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setDataSetsNewData() {
        Comment comment = new Comment("");
        comment.setData("new_data");
        assertEquals("new_data", comment.getData());
    }

    @Test
    public void cloneCreatesNewComment() {
        Comment original = new Comment("data");
        Comment clone = original.clone();
        assertNotNull(clone);
        assertEquals(original.getData(), clone.getData());
    }

    @Test
    public void isXmlDeclarationReturnsFalse() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNull() {
        Comment comment = new Comment("");
        assert (comment.asXmlDeclaration() == null);
    }

    @Test
    public void newNodeComment() {
        Comment comment = new Comment("");
        assertTrue(comment != null);
    }

    @Test
    public void outerHtmlTailHandlesEmptyString() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Appendable text = new StringBuilder(output.toString());
        int depth = 0;
        Document.OutputSettings out = null;
        Comment comment = new Comment("");
        comment.outerHtmlTail(text, depth, out);
        assertFalse(output.toString().isEmpty());
    }

}