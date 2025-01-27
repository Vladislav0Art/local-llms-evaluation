package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedCloneCreatesNewCommentInstance {

    @Test
    public void cloneCreatesNewCommentInstance() {
        Comment comment1 = new Comment("data");
        Comment comment2 = comment1.clone();
        assertTrue(comment1 != comment2);
        assertEquals(1, comment2.getData().length());
    }
}

public class MockParser {

    private Appendable accum;

    @org.junit.Before
    public void setUp() {
        this.accum = mock(Appendable.class);
    }

}