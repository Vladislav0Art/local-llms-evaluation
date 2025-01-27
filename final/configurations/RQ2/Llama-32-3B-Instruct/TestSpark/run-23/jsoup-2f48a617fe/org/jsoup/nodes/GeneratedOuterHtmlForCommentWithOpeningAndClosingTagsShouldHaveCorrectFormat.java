package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedOuterHtmlForCommentWithOpeningAndClosingTagsShouldHaveCorrectFormat {

    @Test
    public void outerHtmlForCommentWithOpeningAndClosingTagsShouldHaveCorrectFormat() {
        Comment comment = new Comment("data");
        String result = comment.getOuterHtml();
        assertTrue(result.startsWith("<") && result.endsWith(">"));
    }
}

public class Comment {
    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String getOuterHtml() {
        return "<" + data + ">";
    }

}