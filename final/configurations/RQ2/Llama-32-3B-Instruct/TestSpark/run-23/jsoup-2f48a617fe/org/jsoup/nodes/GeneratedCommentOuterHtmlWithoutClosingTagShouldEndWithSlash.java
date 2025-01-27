package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedCommentOuterHtmlWithoutClosingTagShouldEndWithSlash {

    @Test
    public void commentOuterHtmlWithoutClosingTagShouldEndWithSlash() throws Exception {
        Comment comment = new Comment("data");
        String result = comment.getOuterHtml();
        assertTrue(result.endsWith("/"));
    }

}