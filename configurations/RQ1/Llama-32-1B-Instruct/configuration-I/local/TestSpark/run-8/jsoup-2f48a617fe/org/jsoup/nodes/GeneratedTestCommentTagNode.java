package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCommentTagNode {

    @Test
    public void testCommentTagNode() {
        // Test Comment Tag Node
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        document.appendChild(comment1);
        assertEquals("<!--This is a sample comment.-->", comment1.outerHtml());
    }

}