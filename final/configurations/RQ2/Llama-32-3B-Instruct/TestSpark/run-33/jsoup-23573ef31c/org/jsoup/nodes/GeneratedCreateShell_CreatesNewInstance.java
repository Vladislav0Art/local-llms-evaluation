package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedCreateShell_CreatesNewInstance {

    @Test
    public void createShell_CreatesNewInstance() {
        Document document = Document.createShell("https://www.example.com");
        assertNotNull(document);
    }

}