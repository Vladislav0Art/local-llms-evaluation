package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedCloneCommentTest {

    @Test
    public void cloneCommentTest() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
    }

}