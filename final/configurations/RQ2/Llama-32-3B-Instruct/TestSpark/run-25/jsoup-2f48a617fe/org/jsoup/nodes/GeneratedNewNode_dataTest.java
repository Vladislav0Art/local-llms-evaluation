package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNewNode_dataTest {

    @Test
    public void newNode_dataTest() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
    }

}