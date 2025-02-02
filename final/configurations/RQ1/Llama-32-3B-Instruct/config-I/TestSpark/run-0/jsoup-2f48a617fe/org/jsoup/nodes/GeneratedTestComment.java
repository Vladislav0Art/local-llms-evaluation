package org.jsoup.nodes;

public class GeneratedTestComment {

    @Test
    public void testComment() {
        Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
        String xmlDeclaration = "<!DOCTYPE html>";
        Element commentElement = document.createElement("comment");
        commentElement.appendText(xmlDeclaration);
        Comment comment = new Comment(commentElement, document);
        assertTrue(comment.isXmlDeclaration());
        assertNull(comment.asXmlDeclaration());
    }
}

}