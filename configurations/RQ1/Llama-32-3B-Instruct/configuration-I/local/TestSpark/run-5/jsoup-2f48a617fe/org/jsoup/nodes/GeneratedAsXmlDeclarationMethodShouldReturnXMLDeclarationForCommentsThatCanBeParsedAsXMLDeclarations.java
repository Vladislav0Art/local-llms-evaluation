package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationMethodShouldReturnXMLDeclarationForCommentsThatCanBeParsedAsXMLDeclarations {

    @Test
    public void asXmlDeclarationMethodShouldReturnXMLDeclarationForCommentsThatCanBeParsedAsXMLDeclarations() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        Comment comment = new Comment("<!DOCTYPE html>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}