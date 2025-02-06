package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedLocation_locationMethodReturnsCorrectString {

    @Test
    public void location_locationMethodReturnsCorrectString() {
        String expectedLocation = "/index.html";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedLocation, document.location());
    }

}