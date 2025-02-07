package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsXmlDeclaration {

    @Test
    public void isXmlDeclaration() {
        Comment comment = new Comment("<![CDATA[Comment text]]>");
        assertTrue(comment.isXmlDeclaration());
    }

}