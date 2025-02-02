package org.jsoup.nodes;

public class GeneratedTestGeneratedComment3 {

    @Test
    public void testGeneratedComment3() {
        Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
        String xmlDeclaration = "<!DOCTYPE html>";
        Element parentNode = new Element("parent", "tag");
        Comment comment = new Comment(parentNode, document);
        assertEquals(comment.getData(), xmlDeclaration);
    }
}

}