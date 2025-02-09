package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTitleSetAndGet SetsAndGetsTitle DocumentWithTitle {

    @Test
    public void titleSetAndGet

    SetsAndGetsTitle DocumentWithTitle() {
        Document document = new Document("https://example.com");
        String title = "Example Title";
        document.title(title);
        assertEquals(title, document.title());
    }

}