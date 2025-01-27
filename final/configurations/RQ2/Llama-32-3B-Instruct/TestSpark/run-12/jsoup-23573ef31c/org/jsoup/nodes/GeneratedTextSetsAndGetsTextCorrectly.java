package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedTextSetsAndGetsTextCorrectly {

    @Test
    public void textSetsAndGetsTextCorrectly() {
        String text = "Example Text";
        Document doc = new Document();
        Element elem = doc.createElement("div");
        elem.text(text);
        assertEquals(text, elem.text());
    }

}