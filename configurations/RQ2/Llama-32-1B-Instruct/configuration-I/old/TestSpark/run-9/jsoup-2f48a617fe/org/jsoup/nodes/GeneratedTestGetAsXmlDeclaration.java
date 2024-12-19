package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetAsXmlDeclaration {

    @Test
    public void testGetAsXmlDeclaration() {
        Comment comment = new Comment("This is a sample comment");
        String expected = "<comment>";
        assertEquals(expected, comment.asXmlDeclaration().getValue());
    }

}