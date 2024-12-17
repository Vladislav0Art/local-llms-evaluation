package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationMethodShouldReturnNullIfDataDoesNotMatchXMLDeclarationPattern {

    @Test
    public void asXmlDeclarationMethodShouldReturnNullIfDataDoesNotMatchXMLDeclarationPattern() {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        Comment comment = new Comment("This is a test");
        assertNull(comment.asXmlDeclaration());
    }

}