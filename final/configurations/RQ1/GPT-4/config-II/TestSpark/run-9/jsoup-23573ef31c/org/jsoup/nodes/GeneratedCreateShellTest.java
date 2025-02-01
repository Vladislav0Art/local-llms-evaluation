package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://test.com");
        assertNotNull(document.select("html"));
    }

}