package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateShellDocTest {

    @Test
    public void createShellDocTest() throws IOException {
        Document document = Document.createShell("https://www.example.com");
        assertNotNull(document);
    }

}