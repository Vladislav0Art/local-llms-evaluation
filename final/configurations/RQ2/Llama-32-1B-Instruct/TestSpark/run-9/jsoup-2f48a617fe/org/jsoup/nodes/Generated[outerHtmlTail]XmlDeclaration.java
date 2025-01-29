package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;

public class Generated[outerHtmlTail]

XmlDeclaration {

    @Test
    public void [outerHtmlTail]XmlDeclaration() {
        Comment comment = new Comment("test");
        comment.outerHtmlTail(null, 0, ParseSettings.getNoSettings());
        String xml = comment.asXmlDeclaration();
        assertEquals("", xml);
    }

}