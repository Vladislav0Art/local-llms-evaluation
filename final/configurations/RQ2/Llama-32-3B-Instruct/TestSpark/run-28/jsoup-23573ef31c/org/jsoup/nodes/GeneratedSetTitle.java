package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSetTitle {

    @Test
    public void setTitle() {
        Document document = new Document("https://www.example.com");
        document.title("Hello World");
        assertEquals("Hello World", document.title());
    }

}