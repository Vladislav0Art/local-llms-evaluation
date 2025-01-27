package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedNodeName_ReturnsCommentForCommentNode {

    @Test
    public void nodeName_ReturnsCommentForCommentNode() {
        Document document = new Document();
        Element element = document.createElement("comment");
        Comment comment = new Comment(element);
        assertEquals("comment", comment.nodeName());
    }

}