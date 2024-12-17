package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCommentOuterHtmlHeadTest {

    @Test
    public void CommentOuterHtmlHeadTest() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        out.setPrettyPrint(true);
        java.io.ByteArrayOutputStream accum = new java.io.ByteArrayOutputStream();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals(java.util.Arrays.toString(new String[]{"!----", ""}), accum.toString().trim());
    }

}