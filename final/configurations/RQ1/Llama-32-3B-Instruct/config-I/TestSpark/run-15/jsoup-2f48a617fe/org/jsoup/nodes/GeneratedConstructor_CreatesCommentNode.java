package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedConstructor_CreatesCommentNode {

    @Test
    public void constructor_CreatesCommentNode() {
        Comment comment = new Comment("This is a comment");
        assertNotNull(comment);
    }

}