package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import static org.mockito.Mockito.when;

public class GeneratedSetCommentsDataUpdatesNode {

    @Test
    public void setCommentsDataUpdatesNode() {
        Comment comment = new Comment("old data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}