package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneShouldReturnNewCommentNode {

    @Test
    public void cloneShouldReturnNewCommentNode() {
        Comment comment = new Comment("This is a test");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getNodeName(), clonedComment.getNodeName());
        assertEquals(comment.getData(), clonedComment.getData());
    }

}