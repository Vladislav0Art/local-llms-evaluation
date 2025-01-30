package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clonedDocument = document.clone();
        assertNotNull(clonedDocument);
        assertEquals(document.location(), clonedDocument.location());
    }

}