package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() throws IOException {
        Comment comment = new Comment("Comment text");
        comment.outerHtmlHead(null, 0, ParseSettings.getDefault()); // empty Appendable
        String expected = "<comment></comment>";
        assertEquals(expected, comment.outerHtmlHead(null, 0, ParseSettings.getDefault()));
    }

}