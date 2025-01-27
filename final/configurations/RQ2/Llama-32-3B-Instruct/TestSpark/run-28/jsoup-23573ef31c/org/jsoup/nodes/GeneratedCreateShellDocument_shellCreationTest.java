package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateShellDocument_shellCreationTest {

    @Test
    public void createShellDocument_shellCreationTest() {
        String baseUri = "https://www.example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection.toString());
        assertNotNull(document);
    }

}