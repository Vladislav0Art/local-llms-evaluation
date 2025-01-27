package org.jsoup.nodes;

public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setup() {
        when(doc.createTextNode(anyString())).thenReturn(textNode);
    }

    @Test
    public void isXmlDeclarationCommentReturnsTrue() {
        // given
        Comment comment = new Comment("some comment");

        // when
        boolean result = comment.isXmlDeclaration();

        // then
        assertTrue(result);
    }

    @Test
    public void asXmlDeclarationCommentReturnsNull() {
        // given
        Comment comment = new Comment("some comment");

        // when
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();

        // then
        assertNull(xmlDeclaration);
    }

}