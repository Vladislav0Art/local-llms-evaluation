package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedCreateShell_ShellIsNotNull {

    @Test
    public void createShell_ShellIsNotNull() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertNotNull(document);
    }

}