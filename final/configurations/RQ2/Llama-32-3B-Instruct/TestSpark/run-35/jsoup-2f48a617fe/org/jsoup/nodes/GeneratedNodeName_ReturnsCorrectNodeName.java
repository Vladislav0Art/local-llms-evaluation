package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_ReturnsCorrectNodeName {

    @Test
    public void nodeName_ReturnsCorrectNodeName() {
        Comment comment = new Comment("");
        assertEquals("COMMENT", comment.nodeName());
    }

}