package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedIsXmlDeclaration_ReturnsFalseForComment {

    @Test
    public void isXmlDeclaration_ReturnsFalseForComment() {
        Document document = new Document();
        Element element = document.createElement("div");
        Comment comment = new Comment(element);
        assertFalse(comment.isXmlDeclaration());
    }

}