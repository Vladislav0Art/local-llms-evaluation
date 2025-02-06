package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;

public class GeneratedLocationShouldReturnCorrectLocation {

    @Test
    public void locationShouldReturnCorrectLocation() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection);
        assertEquals("https://www.example.com", document.location());
    }

}