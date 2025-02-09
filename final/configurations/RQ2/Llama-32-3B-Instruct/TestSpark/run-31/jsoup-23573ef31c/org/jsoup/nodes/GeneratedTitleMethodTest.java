package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTitleMethodTest {

    @Test
    public void titleMethodTest() {
        Document document = new Document();
        assertEquals(null, document.title());
    }

}