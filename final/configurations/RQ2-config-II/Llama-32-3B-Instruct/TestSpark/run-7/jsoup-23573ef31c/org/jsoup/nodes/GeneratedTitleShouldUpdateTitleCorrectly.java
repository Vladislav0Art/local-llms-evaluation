package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;

public class GeneratedTitleShouldUpdateTitleCorrectly {

    @Test
    public void titleShouldUpdateTitleCorrectly() {
        String title = "New Title";
        Document document = new Document();
        document.title(title);
        assertEquals(title, document.title());
    }

}