package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetLocation {

    @Test
    public void getLocation() {
        Document document = new Document("https://www.example.com");
        assertEquals("https://www.example.com", document.location());
    }

}