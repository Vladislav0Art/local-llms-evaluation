package org.jsoup.nodes;

public class GeneratedTestCommentOuterHtmlTail {

    @Test
    public void testCommentOuterHtmlTail() {
        Document document = createDocument();
        Appendable appendable = document.append("<!--Some data-->");
        Comment comment = new Comment(document.toString().substring(7));
        comment.outerHtmlHead(appendable, 0, null);
        assertEquals("<!--Some data-->", appendable.toString());
    }

}