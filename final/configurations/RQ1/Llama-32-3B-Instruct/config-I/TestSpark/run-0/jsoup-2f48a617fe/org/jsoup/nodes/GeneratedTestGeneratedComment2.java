package org.jsoup.nodes;

public class GeneratedTestGeneratedComment2 {

    @Test
    public void testGeneratedComment2() {
        Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
        String xmlDeclaration = "<!DOCTYPE html>";
        Element parentNode = new Element("parent", "tag");
        Comment comment = new Comment(parentNode, document);
        assertTrue(comment.asXmlDeclaration().equals(xmlDeclaration));
    }
}

}