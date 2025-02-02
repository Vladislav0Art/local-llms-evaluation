package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneCommentCreatesNewCopy {

    @Test
    public void cloneCommentCreatesNewCopy() {
        Comment original = new Comment("Some text");
        Comment copy = original.clone();
        assertNotSame(original, copy);
        assertEquals("#comment", copy.nodeName());
        assertEquals("Some text", copy.getData());
    }

}