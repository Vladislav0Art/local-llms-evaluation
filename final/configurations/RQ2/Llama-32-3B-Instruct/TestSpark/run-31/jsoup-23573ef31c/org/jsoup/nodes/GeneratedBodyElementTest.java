package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedBodyElementTest {

    @Test
    public void bodyElementTest() {
        Document document = new Document();
        Element body = document.body();
        assertSame(body, document.createElement("body").element());
    }

}