package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;

public class Generated[outerHtmlTail]

EmptyString {

    @Test
    public void [outerHtmlTail]EmptyString() {
        Comment comment = new Comment("");
        comment.outerHtmlTail(null, 0, ParseSettings.getNoSettings());
        assertEquals("", comment.outerHtmlTail(null, 0, ParseSettings.getNoSettings()));
    }

}