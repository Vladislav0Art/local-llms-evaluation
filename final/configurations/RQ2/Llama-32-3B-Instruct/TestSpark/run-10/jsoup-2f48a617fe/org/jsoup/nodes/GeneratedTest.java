package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void commentConstructors_ReturnsComment() {
        Comment comment = new Comment("data");
        assert comment != null;
    }

    @Test
    public void nodeName_AreNullWhenDataIsEmpty() {
        Comment comment = new Comment("");
        assert comment.nodeName() == null;
    }

    @Test
    public void nodeName_IsData() {
        Comment comment = new Comment("data");
        assert commentnodeName(comment) == "data";
    }

    private String nodeName(Comment comment) {
        return comment.nodeName();
    }

    @Test
    public void getData_AreNullWhenEmpty() {
        Comment comment = new Comment("");
        assert comment.getData() == null;
    }

    @Test
    public void getData_ReturnsData() {
        Comment comment = new Comment("data");
        assert comment.getData().equals("data");
    }

    @Test
    public void setData_AreNullWhenEmpty() {
        Comment comment = new Comment("");
        comment.setData("");
        assert comment.getData() == null;
    }

    @Test
    public void setData_ReturnsCommentWithNewData() {
        Comment comment = new Comment("old_data");
        comment.setData("new_data");
        assert comment.getData().equals("new_data");
    }

    @Test
    public void outerHtmlHead_AccumIsNotnullAndDepthIs0() throws IOException {
        Appable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).append(anyString());
    }

    @Test
    public void outerHtmlTail_AccumIsNotnull() {
        Appable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 0, out);
        verify(accum).append(anyString());
    }

    @Test
    public void outerHtmlHead_ThrowsIOExceptionWhenDepthIsNegative() throws IOException {
        Appable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, -1, out);
        assertThrows(IOException.class, () -> comment.outerHtmlHead(accum, -1, out));
    }

    @Test
    public void outerHtmlTail_ThrowsIOExceptionWhenDepthIsNegative() throws IOException {
        Appable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, -1, out);
        assertThrows(IOException.class, () -> comment.outerHtmlTail(accum, -1, out));
    }

    @Test
    public void toString_ReturnsString() {
        Comment comment = new Comment("data");
        String expected = "<!-- data -->";
        assertEquals(expected, comment.toString());
    }

    @Test
    public void clone_ReturnsComment() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        assert cloned != null;
    }

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        Comment comment = new Comment("");
        assert !comment.isXmlDeclaration();
    }

    @Test
    public void asXmlDeclaration_ReturnsNullWhenNotDeclaration() {
        Comment comment = new Comment("");
        assert comment.asXmlDeclaration() == null;
    }

    private <T> T mock(Class<T> clazz) {
        return Mockito.mock(clazz);
    }

}