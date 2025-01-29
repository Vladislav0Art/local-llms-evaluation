package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;

public class Generated[outerHtmlHead]

EmptyString {

    @Test
    public void [outerHtmlHead]EmptyString() {
        Comment comment = new Comment("");
        comment.outerHtmlHead(null, 0, ParseSettings.getNoSettings());
        assertEquals("", comment.outerHtmlHead(null, 0, ParseSettings.getNoSettings()));
    }

}