package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeName_test {

    @Test
    public void nodeName_test() {
        Comment comment = new Comment();
        String nodeName = comment.nodeName();
        assertTrue(nodeName.isEmpty());
    }

}