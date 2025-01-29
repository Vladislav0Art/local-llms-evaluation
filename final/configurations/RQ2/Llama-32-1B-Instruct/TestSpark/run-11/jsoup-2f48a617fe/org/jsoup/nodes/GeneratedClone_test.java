package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.function.Supplier;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        Comment comment = new Comment("This is a test");
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

}