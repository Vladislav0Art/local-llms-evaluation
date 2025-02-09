package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedHead_RetrievesHeadElement {

    @Test
    public void head_RetrievesHeadElement() {
        Document document = new Document("https://www.example.com");
        Element head = document.head();
        assertNotNull(head);
    }

}