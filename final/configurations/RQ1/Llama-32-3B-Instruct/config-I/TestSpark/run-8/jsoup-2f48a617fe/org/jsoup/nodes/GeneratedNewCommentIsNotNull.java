package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;

public class GeneratedNewCommentIsNotNull {

    @Test
    public void newCommentIsNotNull() {
        Comment comment = new Comment("Hello World");
        assertNotNull(comment);
    }

}