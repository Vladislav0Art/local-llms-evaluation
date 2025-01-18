package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedHeadElementTest {

    @Test
    public void headElementTest() {
        Document document = new Document("http://test.url");
        Element head = document.head();
        assertNotNull(head);
    }

}