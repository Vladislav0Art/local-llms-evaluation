package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetOuterHtml {

    @Test
    public void getOuterHtml() {
        Document document = new Document("https://www.example.com");
        String outerHtml = document.outerHtml();
        assertTrue(outerHtml == null || outerHtml.isEmpty());
    }

}