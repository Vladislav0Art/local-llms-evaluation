package org.jsoup.nodes;

public class GeneratedTestGeneratedComment {

    @Test
    public void testGeneratedComment() {
        Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
        String xmlDeclaration = "<!DOCTYPE html>";
        Element parentNode = new Element("parent", "tag");
        Comment comment = new Comment(parentNode, document);
        assertEquals(xmlDeclaration, comment.nodeName());
    }
}

}