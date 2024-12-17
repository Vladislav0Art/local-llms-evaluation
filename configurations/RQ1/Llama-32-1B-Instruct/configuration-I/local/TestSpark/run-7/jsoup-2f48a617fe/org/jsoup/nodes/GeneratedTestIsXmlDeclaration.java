package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;

public class GeneratedTestIsXmlDeclaration {

    public String data = "";

    public static Comment createComment(String content) {
        return new Comment(content);
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = createComment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}