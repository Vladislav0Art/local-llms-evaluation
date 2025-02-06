package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone {

    @Test
    public void clone() {
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

}