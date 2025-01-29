package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;

public class Generated[outerHtmlHead]

XmlDeclaration {

    @Test
    public void [outerHtmlHead]XmlDeclaration() {
        Comment comment = new Comment("test");
        comment.outerHtmlHead(new ParseSettings(), 1, Document.OutputSettings.html());
        String xml = comment.asXmlDeclaration();
        assertEquals("test", xml);
    }

}