package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedCloneCreatesNewCommentWithSameDataTest {

    @Test
    public void cloneCreatesNewCommentWithSameDataTest() {
        Comment comment1 = new Comment("data");
        Comment comment2 = comment1.clone();
        assertEquals(comment1.getData(), comment2.getData());
    }

}