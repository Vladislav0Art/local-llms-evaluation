package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullIfDataDoesNotLookLikeXMLDeclaration {

    @Test
    public void asXmlDeclarationReturnsNullIfDataDoesNotLookLikeXMLDeclaration() {
        Comment comment = new Comment("Invalid Data");
        assert null == comment.asXmlDeclaration();
    }

}