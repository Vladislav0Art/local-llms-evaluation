package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetBodyTag {

    @Test
    public void getBodyTag() {
        Document document = new Document("https://www.example.com");
        Element bodyElement = document.body();
        assertTrue(bodyElement instanceof org.jsoup.nodes.Tag);
    }

}