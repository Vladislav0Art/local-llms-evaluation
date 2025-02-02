package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestCommentNode {

    @Test
    public void testCommentNode() {
        Comment comment = new Comment("#This is a comment");
        assertEquals("#comment", comment.nodeName());
    }

}