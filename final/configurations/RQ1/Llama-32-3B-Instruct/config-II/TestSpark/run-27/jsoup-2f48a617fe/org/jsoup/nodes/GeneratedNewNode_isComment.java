package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNewNode_isComment {

    @Test
    public void newNode_isComment() {
        Comment comment = new Comment("<!-- data -->");
        assert comment instanceof org.jsoup.nodes.Comment;
    }

}