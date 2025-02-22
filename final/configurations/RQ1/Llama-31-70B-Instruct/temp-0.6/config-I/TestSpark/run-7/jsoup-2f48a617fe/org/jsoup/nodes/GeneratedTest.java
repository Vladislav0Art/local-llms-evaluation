package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    Comment comment;

    @Before
    public void setup() {
        comment = new Comment("This is a comment");
    }

    @Test
    public void getDataTest() {
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void setDataTest() {
        comment.setData("New comment");
        assertEquals("New comment", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        Document doc = mock(Document.class);
        when(doc.outputSettings()).thenReturn(new Document.OutputSettings());
        comment.setDocument(doc);
        comment.outerHtmlHead(accum, 0, doc.outputSettings());
        assertEquals("<!--This is a comment-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        Document doc = mock(Document.class);
        when(doc.outputSettings()).thenReturn(new Document.OutputSettings());
        comment.setDocument(doc);
        comment.outerHtmlTail(accum, 0, doc.outputSettings());
        assertEquals("", accum.toString());
    }

}