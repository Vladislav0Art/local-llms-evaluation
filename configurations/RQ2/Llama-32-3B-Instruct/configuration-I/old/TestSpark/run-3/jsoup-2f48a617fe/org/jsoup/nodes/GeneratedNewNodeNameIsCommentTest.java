package org.jsoup.nodes;

import org.jsoup.Document;
import org.jsoup.nodes.Document.Builder;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedNewNodeNameIsCommentTest {

    @Test
    public void newNodeNameIsCommentTest() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

}