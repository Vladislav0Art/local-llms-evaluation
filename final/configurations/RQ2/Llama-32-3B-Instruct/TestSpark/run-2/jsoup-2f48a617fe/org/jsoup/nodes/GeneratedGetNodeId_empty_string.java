package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetNodeId_empty_string {

    @Test
    public void getNodeId_empty_string() {
        Comment comment = new Comment("");
        assertEquals("", comment.nodeName());
    }

}