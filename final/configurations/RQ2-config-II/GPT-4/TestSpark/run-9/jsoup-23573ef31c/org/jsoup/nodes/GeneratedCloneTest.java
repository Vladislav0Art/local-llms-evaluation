package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc = new Document("https://www.example.com");
        Document doc2 = doc.clone();
        assertNotNull(doc2);
        assertNotSame(doc, doc2);
    }

}