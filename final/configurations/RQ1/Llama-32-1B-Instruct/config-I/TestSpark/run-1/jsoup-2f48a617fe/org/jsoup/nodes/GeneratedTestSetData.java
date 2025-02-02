package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Document doc = new Document();
        Element element = doc.createElement("div");
        comment = (Comment) element.appendChild(doc.createComments([new Comment("#This is a comment")]));
        String value = comment.setData("Some content");
        assertEquals("Some content", value);
    }

}