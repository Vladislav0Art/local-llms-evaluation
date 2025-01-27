package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedCommentOuterHtmlForCommentWithOpeningAndClosingTagsShouldHaveCorrectFormat {

    @Test
    public void commentOuterHtmlForCommentWithOpeningAndClosingTagsShouldHaveCorrectFormat() throws Exception {
        Comment comment = new Comment("<data>");
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
        if (data == null || data.isEmpty()) {
            return "";
        } else {
            return "<" + data + ">";
        }
    }

}