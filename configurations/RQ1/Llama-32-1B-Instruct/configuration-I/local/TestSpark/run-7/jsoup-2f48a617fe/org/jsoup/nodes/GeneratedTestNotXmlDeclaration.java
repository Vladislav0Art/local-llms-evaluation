package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;

public class GeneratedTestNotXmlDeclaration {

    public String data = "";

    public static Comment createComment(String content) {
        return new Comment(content);
    }

    @Test
    public void testNotXmlDeclaration() {
        Comment comment = createComment(data + " not xml declaration");
        assertFalse(comment.isXmlDeclaration());
    }

}