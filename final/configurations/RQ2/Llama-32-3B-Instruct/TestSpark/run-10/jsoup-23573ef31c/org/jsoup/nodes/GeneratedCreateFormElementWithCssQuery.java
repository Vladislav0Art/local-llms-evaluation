package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedCreateFormElementWithCssQuery {

    public static class Connection {
        public String getUri() {
            return "http://example.com";
        }
    }

    @Test
    public void createFormElementWithCssQuery() {
        String cssQuery = "form";
        Element form = new Element("http://example.com").expectForm(cssQuery);
        assertNotNull(form);
    }

}