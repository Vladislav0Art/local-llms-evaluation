package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedTitleSetsTitle {

    public static class Connection {
        public String getUri() {
            return "http://example.com";
        }
    }

    @Test
    public void titleSetsTitle() {
        String title = "Hello World";
        Document document = new Document();
        document.title(title);
        assertEquals(title, document.getTitle());
    }

}