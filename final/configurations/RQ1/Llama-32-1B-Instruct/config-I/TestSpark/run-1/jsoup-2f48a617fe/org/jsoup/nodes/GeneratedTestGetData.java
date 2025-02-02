package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        Document doc = new Document();
        Element element = doc.createElement("div");
        element.appendChild(doc.createComments([new Comment("#This is a comment with some content")]));
        String value = element.textContent();
        assertEquals("This is a comment with some content", value);
    }

}