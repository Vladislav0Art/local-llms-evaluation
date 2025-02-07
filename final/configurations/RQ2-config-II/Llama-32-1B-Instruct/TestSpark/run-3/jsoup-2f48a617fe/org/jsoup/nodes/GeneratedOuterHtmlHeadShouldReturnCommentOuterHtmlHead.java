package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedOuterHtmlHeadShouldReturnCommentOuterHtmlHead {

    @Test
    public void outerHtmlHeadShouldReturnCommentOuterHtmlHead() throws IOException {
        Comment comment = new Comment("");
        ParseSettings parseSettings = new ParseSettings();
        comment.outerHtmlHead(parseSettings, 0, null);
        assertNotNull(comment.outerHtmlHead);
    }

}