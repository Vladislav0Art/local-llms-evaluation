package org.jsoup.nodes;

public class GeneratedTestGeneratedComment4 {

    @Test
    public void testGeneratedComment4() {
        Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
        String xmlDeclaration = "<!DOCTYPE html>";
        Element parentNode = new Element("parent", "tag");
        Comment comment = new Comment(parentNode, document);
        assertFalse(comment.isXmlDeclaration());
    }

}