package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewComment_ReturnsComment {

    @Test
    public void newComment_ReturnsComment() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("data", comment.getData());
    }

}