package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createCommentWithData() {
        // given:
        String data = "Hello, World!";
        Comment comment = new Comment(data);

        // when:
        assert comment.getData().equals(data);
        assert comment.nodeName().equals("#comment");
    }

    @Test
    public void setNodeNameIsComment() {
        // given:
        Comment comment = new Comment("Hello, World!");

        // when:
        String nodeName = comment.nodeName();
        assertEquals("#comment", nodeName);
    }

    @Test
    public void getOuterHtmlHeadWithPrettyPrintAndBlock() {
        // given:
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        Element parentNode = mock(Element.class);
        String data = "Hello, World!";

        when(parentNode.tag()).thenReturn(mock(Tag.class));

        // when:
        comment.outerHtmlHead(accum, depth, out);

        // verify:
        verify(accum).append(anyString());
        verify(out).prettyPrint();
    }

    @Test
    public void getOuterHtmlTailIsEmpty() {
        // given:
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;

        // when:
        comment.outerHtmlTail(accum, depth, out);

        // verify:
        verify(accum).append(anyString());
    }

    @Test
    public void cloneCommentsContent() {
        // given:
        Comment comment = new Comment("Hello, World!");
        Comment clonedComment = comment.clone();

        // when:
        String data = clonedComment.getData();
        assertEquals(comment.getData(), data);

        // verify:
        assertNotNull(clonedComment);
        assertTrue(clonedComment instanceof Comment);
    }

    @Test
    public void isXmlDeclarationIsFalse() {
        // given:
        Comment comment = new Comment("Hello, World!");

        // when:
        boolean isDeclaration = comment.isXmlDeclaration();

        // verify:
        assertFalse(isDeclaration);
    }

    @Test
    public void isXmlDeclarationWithStartsWithSlashIsTrue() {
        // given:
        Comment comment = new Comment("!Hello, World!");

        // when:
        boolean isDeclaration = comment.isXmlDeclaration();

        // verify:
        assertTrue(isDeclaration);
    }

    @Test
    public void asXmlDeclarationReturnsNullForInvalidData() {
        // given:
        Comment comment = new Comment("Hello, World!");

        // when:
        XmlDeclaration decl = comment.asXmlDeclaration();

        // verify:
        assertNull(decl);
    }

    @Test
    public void asXmlDeclarationParsesCorrectlyWhenValidData() {
        // given:
        Comment comment = new Comment("<?xml version=\"1.0\"?><hello world/>");

        // when:
        XmlDeclaration decl = comment.asXmlDeclaration();

        // verify:
        assertNotNull(decl);
        assertEquals("hello", decl.tagName());
    }

    @Test
    public void asXmlDeclarationReturnsNullWhenInnerElementsExist() {
        // given:
        Comment comment = new Comment("<?xml version=\"1.0\"?><html><body>Hello, World!</body></html>");

        // when:
        XmlDeclaration decl = comment.asXmlDeclaration();

        // verify:
        assertNull(decl);
    }

    @Test
    public void asXmlDeclarationParsesCorrectlyWhenValidDataWithNamespace() {
        // given:
        Comment comment = new Comment("<:hello world:/>");

        // when:
        XmlDeclaration decl = comment.asXmlDeclaration();

        // verify:
        assertNotNull(decl);
        assertEquals("hello", decl.tagName());
    }

}