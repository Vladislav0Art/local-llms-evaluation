package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNewCommentConstructWithData {

    @Test
    public void newCommentConstructWithData() {
        try {
            Comment comment = new Comment("<!-- This is a comment -->");
            assertEquals(comment.getData(), "<!-- This is a comment -->");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}