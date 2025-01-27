package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedNodeName_isComment {

    @Test
    public void nodeName_isComment() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

}