package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document document = new Document("https://sample.com");
        document.expectForm("");
    }

}