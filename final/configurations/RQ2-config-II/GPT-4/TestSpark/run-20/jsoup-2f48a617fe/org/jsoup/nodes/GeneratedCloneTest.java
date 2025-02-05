package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.annotation.Nullable;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test data");
        Comment cloneComment = comment.clone();
        assertNotNull(cloneComment);
        assertEquals(cloneComment.getData(), comment.getData());
    }

}