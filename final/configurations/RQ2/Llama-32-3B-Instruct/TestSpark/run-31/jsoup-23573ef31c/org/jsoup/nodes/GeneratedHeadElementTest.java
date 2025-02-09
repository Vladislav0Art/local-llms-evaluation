package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedHeadElementTest {

    @Test
    public void headElementTest() {
        Document document = new Document();
        Element head = document.head();
        assertSame(head, document.createElement("head").element());
    }

}