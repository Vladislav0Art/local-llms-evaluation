package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetTitle {

    @Test
    public void getTitle() {
        Document document = new Document("https://www.example.com");
        String title = document.title();
        assertTrue(title == null || title.isEmpty());
    }

}