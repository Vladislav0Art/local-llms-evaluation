package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedTitle_SetTitleReturnsString {

    @Test
    public void title_SetTitleReturnsString() {
        Document document = new Document("https://www.example.com");
        String title = document.title();
        assertNotNull(title);
    }

}