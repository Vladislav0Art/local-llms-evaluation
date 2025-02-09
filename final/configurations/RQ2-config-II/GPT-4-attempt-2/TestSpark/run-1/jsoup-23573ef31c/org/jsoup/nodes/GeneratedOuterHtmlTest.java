package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document document = new Document("");
        assertTrue(document.outerHtml().contains("<html>"));
    }

}