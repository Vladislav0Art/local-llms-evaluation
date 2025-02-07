package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedNodeNameShouldReturnCommentNode {

    @Test
    public void nodeNameShouldReturnCommentNode() {
        Comment comment = new Comment("This is a comment");
        assertEquals("comment", comment.nodeName());
    }

}