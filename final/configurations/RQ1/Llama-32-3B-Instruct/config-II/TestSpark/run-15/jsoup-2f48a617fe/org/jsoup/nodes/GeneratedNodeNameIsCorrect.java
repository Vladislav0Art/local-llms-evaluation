package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNodeNameIsCorrect {

    @Test
    public void nodeNameIsCorrect() {
        Comment comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

}