package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetData {

    @Test
    public void getData() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

}