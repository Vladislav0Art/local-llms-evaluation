package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCommentToStringFromData {

    public static Element asXmlDeclaration() {
        return new Element("xml");
    }

    @Test
    public void testCommentToStringFromData() {
        String commentData = "some data";
        Element commentNode = new Element("comment");
        commentNode.setText(commentData);

        String expectedOutput = "<comment>Comment</comment>";

        assertEquals(expectedOutput, commentNode.toString());
    }

}