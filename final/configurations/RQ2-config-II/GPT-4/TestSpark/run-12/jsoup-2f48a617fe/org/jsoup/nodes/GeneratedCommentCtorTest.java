package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentCtorTest {

    @Test
    public void CommentCtorTest() {
        String testData = "this is a comment";
        Comment comment = new Comment(testData);

        assertEquals(testData, comment.getData());
        assertEquals("#comment", comment.nodeName());
    }

}