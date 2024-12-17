package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class GeneratedClone_ReturnsCorrectNode {

    @Test
    public void clone_ReturnsCorrectNode() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

}