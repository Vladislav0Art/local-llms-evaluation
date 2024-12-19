package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedNodeName_returnsCorrectValue {

    @Test
    public void nodeName_returnsCorrectValue() {
        Comment comment = new Comment("This is a comment");
        assertEquals("#comment", comment.nodeName());
    }

}