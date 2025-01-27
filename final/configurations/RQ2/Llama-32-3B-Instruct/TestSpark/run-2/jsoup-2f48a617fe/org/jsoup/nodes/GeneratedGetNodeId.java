package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetNodeId {

    @Test
    public void getNodeId() {
        String data = "CommentData";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

}