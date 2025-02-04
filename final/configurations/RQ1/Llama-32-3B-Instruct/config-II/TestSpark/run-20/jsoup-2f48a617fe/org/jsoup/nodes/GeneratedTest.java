package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createCommentWithData_ReturnsComment() {
        Comment comment = new Comment("Hello World");
        assert comment != null;
    }

    @Test
    public void nodeName_ReturnsExpectedValue() {
        Comment comment = new Comment("Hello World");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getData_ReturnsCommentData() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

    @Test
    public void setData_SetDataAndReturnThis_WhenCalled() {
        Comment comment = new Comment("Hello World");
        String newData = "New Data";
        Comment result = comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHead_AppendsCommentDataWhenPrettyPrinted() throws IOException {
        Comment comment = new Comment("Hello World");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(false);

        comment.outerHtmlHead(accum, 0, out);

        verify(accum).append("<!--Hello World-->");
    }

    @Test
    public void outerHtmlTail_AppendsNothing() throws IOException {
        Comment comment = new Comment("");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        comment.outerHtmlHead(accum, 0, out);

        verify(accum).append(anyString());
    }

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        Comment comment = new Comment("Hello World");
        String expected = "<!--Hello World-->";
        assertEquals(expected, comment.toString());
    }

    @Test
    public void clone_ReturnsCommentClone() {
        Comment comment = new Comment("Hello World");
        Comment result = comment.clone();
        assertNotNull(result);
        assert result == comment;
    }

    @Test
    public void isXmlDeclaration_ReturnsTrueWhenDataStartsWithSlashOrQuestionMark() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration_ReturnsFalseWhenDataDoesNotStartWithSlashOrQuestionMark() {
        Comment comment = new Comment("Hello World");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_ReturnsXmlDeclarationIfParsingSucceeds() throws IOException {
        String fragment = "<!DOCTYPE html>";
        Comment comment = new Comment(fragment);
        XmlDeclaration result = comment.asXmlDeclaration();
        assertNotNull(result);
    }

    @Test
    public void asXmlDeclaration_ReturnsNullWhenDataIsNotXmlDeclaration() throws IOException {
        String fragment = "<p>Hello World</p>";
        Comment comment = new Comment(fragment);
        assertNull(comment.asXmlDeclaration());
    }

}