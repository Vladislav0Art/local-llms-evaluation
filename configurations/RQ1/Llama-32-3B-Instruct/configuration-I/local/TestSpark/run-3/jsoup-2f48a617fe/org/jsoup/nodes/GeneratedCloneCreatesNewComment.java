package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedCloneCreatesNewComment {

    @Test
    public void cloneCreatesNewComment() {
        Comment comment = new Comment("Hello World!");
        Comment cloned = comment.clone();
        assertNotSame(comment, cloned);
        assertEquals("Hello World!", cloned.getData());
    }

}