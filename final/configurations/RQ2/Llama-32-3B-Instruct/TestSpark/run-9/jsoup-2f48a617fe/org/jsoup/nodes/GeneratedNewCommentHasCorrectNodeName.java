package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewCommentHasCorrectNodeName {

    @Test
    public void newCommentHasCorrectNodeName() {
        Comment comment = new Comment("test");
        assertEquals("comment", comment.nodeName());
    }

}