package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Nodes;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document document = Document.createShell("https://www.google.com");
        assertNotNull(document.body());
        assertTrue("The Element for body not found", document.body().normalName().equals("body"));
    }

}