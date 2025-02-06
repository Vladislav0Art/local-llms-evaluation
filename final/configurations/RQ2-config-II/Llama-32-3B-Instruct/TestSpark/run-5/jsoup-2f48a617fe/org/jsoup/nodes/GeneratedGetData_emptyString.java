package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Comment;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.mockito.Mockito;

public class GeneratedGetData_emptyString {

    @Test
    public void getData_emptyString() {
        // [Data][EmptyString]Test
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}