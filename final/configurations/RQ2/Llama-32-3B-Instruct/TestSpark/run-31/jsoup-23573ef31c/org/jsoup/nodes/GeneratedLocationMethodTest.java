package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedLocationMethodTest {

    @Test
    public void locationMethodTest() {
        Document document = new Document();
        assertEquals(null, document.location());
    }

}