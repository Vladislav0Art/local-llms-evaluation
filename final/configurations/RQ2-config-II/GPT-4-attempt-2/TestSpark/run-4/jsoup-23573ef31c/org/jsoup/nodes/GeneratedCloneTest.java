package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc = new Document("http://example.com");
        Document clonedDoc = doc.clone();
        assertNotSame(clonedDoc, doc);
    }

}