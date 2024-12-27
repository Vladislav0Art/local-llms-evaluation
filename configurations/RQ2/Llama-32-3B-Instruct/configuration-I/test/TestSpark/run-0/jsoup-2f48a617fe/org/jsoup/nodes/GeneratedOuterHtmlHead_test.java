package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHead_test {

    @Test
    public void outerHtmlHead_test() {
        Comment comment = new Comment("");
        StringBuilder accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;
        try {
            comment.outerHtmlHead(accum, depth, out);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}