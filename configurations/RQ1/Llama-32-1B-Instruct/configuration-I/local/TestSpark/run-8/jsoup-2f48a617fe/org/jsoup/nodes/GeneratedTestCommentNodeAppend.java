package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCommentNodeAppend {

    @Test
    public void testCommentNodeAppend() {
        // Test Comment Node Append
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        document.appendChild(comment1);
    }

}