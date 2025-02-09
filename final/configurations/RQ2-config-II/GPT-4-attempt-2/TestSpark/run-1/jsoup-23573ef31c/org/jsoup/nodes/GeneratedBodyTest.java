package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document doc = Document.createShell("");
        assertNotNull(doc.body());
    }

}