package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedGetData_ReturnsCorrectDataForComment {

    @Test
    public void getData_ReturnsCorrectDataForComment() {
        String originalData = "some comment";
        Document document = new Document();
        Element element = document.createElement("div");
        element.appendChild(document.createComment(originalData));
        Comment comment = new Comment(element);
        assertEquals(originalData, comment.getData());
    }

}