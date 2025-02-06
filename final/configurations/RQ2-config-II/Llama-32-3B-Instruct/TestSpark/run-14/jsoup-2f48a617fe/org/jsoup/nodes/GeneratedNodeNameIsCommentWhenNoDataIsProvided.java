package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedNodeNameIsCommentWhenNoDataIsProvided {

    @Test
    public void nodeNameIsCommentWhenNoDataIsProvided() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

}