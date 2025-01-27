package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateHeadTag {

    @Test
    public void createHeadTag() {
        Document document = new Document("https://www.example.com");
        Element headElement = document.head();
        assertTrue(headElement instanceof org.jsoup.nodes.Tag);
    }

}