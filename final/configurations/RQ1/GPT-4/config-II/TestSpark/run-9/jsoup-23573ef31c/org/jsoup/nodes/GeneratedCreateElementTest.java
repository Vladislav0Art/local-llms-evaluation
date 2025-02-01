package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = Document.createShell("");
        Element element = document.createElement("p");
        assertEquals("p", element.nodeName());
    }

}