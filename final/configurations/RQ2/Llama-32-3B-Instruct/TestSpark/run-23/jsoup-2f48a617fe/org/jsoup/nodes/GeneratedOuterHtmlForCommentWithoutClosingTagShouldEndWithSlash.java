package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedOuterHtmlForCommentWithoutClosingTagShouldEndWithSlash {

    @Test
    public void outerHtmlForCommentWithoutClosingTagShouldEndWithSlash() {
        Comment comment = new Comment("data");
        String result = comment.getOuterHtml();
        assertTrue(result.endsWith("/"));
    }

}