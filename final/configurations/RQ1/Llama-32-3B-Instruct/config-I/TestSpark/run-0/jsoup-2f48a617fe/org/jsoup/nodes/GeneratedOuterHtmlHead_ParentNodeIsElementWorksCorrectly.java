package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_ParentNodeIsElementWorksCorrectly {

    @Test
    public void OuterHtmlHead_ParentNodeIsElementWorksCorrectly() throws IOException {
        Appendable appendable = new StringBuilder();
        Comment comment = new Comment("");
        Document.OutputSettings out = new Document.OutputSettings(false);
        Element parentNode = new org.jsoup.nodes.Element();
        comment.setNode(parentNode);
        comment.outerHtmlHead(appendable, 0, out);
        assertTrue(parentNode.tagName().equals(comment.nodeName()));
    }

}