package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        String expected = "<!xml declaration content>";
        Comment comment = new Comment(expected);
        Assert.assertTrue(comment.isXmlDeclaration());
    }

}