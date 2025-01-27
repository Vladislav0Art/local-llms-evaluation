package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void constructorCommentNotNullTest() {
        assertNonnull(new Comment(""));
    }

    @Test
    public void constructorCommentNullThrowsNullPointerExceptionTest() {
        assertThrows(NullPointerException.class, () -> new Comment(null));
    }

    @Test
    public void nodeNameCommentStringReturnsCorrectNameTest() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataCommentStringReturnsDataValueTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setDataCommentStringSetsCorrectDataValueTest() {
        Comment comment = new Comment("");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadCommentNotImplementedTest() {
        assertThrows(UnsupportedOperationException.class, () -> new Comment("").outerHtmlHead(null, 0, null));
    }

    @Test
    public void outerHtmlTailCommentNotImplementedTest() {
        assertThrows(UnsupportedOperationException.class, () -> new Comment("").outerHtmlTail(null, 0, null));
    }

    @Test
    public void toStringCommentReturnsCorrectStringRepresentationTest() {
        Comment comment = new Comment("data");
        assertEquals("<!-- data -->", comment.toString());
    }

    @Test
    public void cloneCommentCreatesNewCommentNodeTest() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
    }

    @Test
    public void isXmlDeclarationCommentTrueTest() {
        assertTrue(new Comment("").isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationCommentReturnsNullTest() {
        assertNull(new Comment("").asXmlDeclaration());
    }

}