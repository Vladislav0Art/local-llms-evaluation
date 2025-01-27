package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedCommentOuterHtmlForEmptyStringShouldBeEmpty {

    @Test
    public void commentOuterHtmlForEmptyStringShouldBeEmpty() throws Exception {
        Comment comment = new Comment("");
        String result = comment.getOuterHtml();
        assertEquals("", result);
    }

}