package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateDocumentFromShell ShellCreationTest {

    @Test
    public void createDocumentFromShell

    ShellCreationTest() {
        String baseUri = "https://www.example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection.toString());
        assertNotNull(document);
    }

}