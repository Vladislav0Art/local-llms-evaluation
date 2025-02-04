package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewCommentNode {

    @Test
    public void newCommentNode() {
        Comment comment = new Comment("This is a test");
        assertNotNull(comment);
    }

}