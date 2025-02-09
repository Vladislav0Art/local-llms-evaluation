package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Document doc = Document.createShell("");
        assertEquals("#document", doc.nodeName());
    }

}