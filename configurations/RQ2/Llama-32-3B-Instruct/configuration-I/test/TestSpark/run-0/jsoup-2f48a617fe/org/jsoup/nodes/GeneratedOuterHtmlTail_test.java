package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail_test {

    @Test
    public void outerHtmlTail_test() {
        Comment comment = new Comment("");
        StringBuilder accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
    }

}