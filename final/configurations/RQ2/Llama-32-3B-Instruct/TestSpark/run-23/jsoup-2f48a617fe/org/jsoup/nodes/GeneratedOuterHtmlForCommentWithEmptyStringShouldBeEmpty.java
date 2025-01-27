package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedOuterHtmlForCommentWithEmptyStringShouldBeEmpty {

    @Test
    public void outerHtmlForCommentWithEmptyStringShouldBeEmpty() {
        Comment comment = new Comment("");
        String result = comment.getOuterHtml();
        assertEquals("", result);
    }

}