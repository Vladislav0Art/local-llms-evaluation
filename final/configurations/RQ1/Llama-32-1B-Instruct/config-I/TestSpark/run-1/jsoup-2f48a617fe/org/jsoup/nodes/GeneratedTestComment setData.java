package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestComment setData {

    @Test
    public void testComment

    setData() {
        Document doc = new Document();
        Element element = doc.createElement("div");
        comment = (Comment) element.appendChild(doc.createComments([new Comment("#This is a comment with some content")]))
        ;
        comment.setData("More content");
        String expected = "#This is a comment\nMore content";
        String actual = element.textContent();
        assertEquals(expected, actual);
    }

}