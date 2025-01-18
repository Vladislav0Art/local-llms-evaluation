package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateElementTest {

    @Mock
    private Connection mockConnection;

    @Mock
    private Parser mockParser;

    @Test
    public void createElementTest() {
        Document document = new Document("http://baseUri.com");
        Element element = document.createElement("div");
        assertEquals("div", element.tagName());
    }

}