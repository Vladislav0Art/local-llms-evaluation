package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedOuterHtmlTailShouldReturnCommentOuterHtmlTail {

    @Test
    public void outerHtmlTailShouldReturnCommentOuterHtmlTail() throws IOException {
        Comment comment = new Comment("");
        ParseSettings parseSettings = new ParseSettings();
        comment.outerHtmlTail(parseSettings, 0, null);
        assertNotNull(comment.outerHtmlTail);
    }

}