package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCommentToString {

    public static Element asXmlDeclaration() {
        return new Element("xml");
    }

    @Test
    public void testCommentToString() {
        Document document = new Document();
        String comment = "<comment>Comment</comment>";
        Element commentNode = document.createElement("comment");
        commentNode.textContent = comment;

        assertEquals(comment, commentNode.toString());

        // Call the methods on the Comment class to verify they return the expected output
        assertEquals(commentData, commentNode.getData());
    }

}