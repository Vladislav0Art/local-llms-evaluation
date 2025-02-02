package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        String expectedContent = "<!xml declaration content>";
        Comment originalComment = new Comment("#original comment content");
        Comment parsedComment = (Comment) originalComment.asXmlDeclaration();
        Assert.assertEquals(expectedContent, parsedComment.getData());
    }

}