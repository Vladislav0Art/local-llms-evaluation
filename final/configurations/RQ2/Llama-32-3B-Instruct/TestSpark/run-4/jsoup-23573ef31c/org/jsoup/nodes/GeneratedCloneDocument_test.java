package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedCloneDocument_test {

    @Test
    public void cloneDocument_test() {
        Document document = new Document("https://example.com");
        Document clonedDocument = document.clone();
        assertNotNull(clonedDocument);
    }

}