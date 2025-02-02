package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHeadWithComment {

    @Test
    public void testOuterHtmlHeadWithComment() throws Exception {
        Document doc = new Document();
        Node parentNode = doc.appendElement("div");
        Comment comment = new Comment("");
        parentNode.appendChild(comment);
        assertEquals(doc.outerHtml(), parentNode.outerHtml());
    }

}