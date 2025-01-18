package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.nio.charset.Charset;
import java.util.List;

import org.jsoup.parser.Parser;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc1 = new Document("http://www.example.com");
        Document doc2 = doc1.clone();
        assertNotSame(doc1, doc2);
    }

}