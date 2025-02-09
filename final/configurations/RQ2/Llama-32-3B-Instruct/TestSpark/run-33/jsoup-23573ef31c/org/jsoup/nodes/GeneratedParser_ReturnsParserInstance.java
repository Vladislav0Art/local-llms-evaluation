package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedParser_ReturnsParserInstance {

    @Test
    public void parser_ReturnsParserInstance() {
        Document document = new Document("https://www.example.com");
        Parser parser = document.parser();
        assertNotNull(parser);
    }

}