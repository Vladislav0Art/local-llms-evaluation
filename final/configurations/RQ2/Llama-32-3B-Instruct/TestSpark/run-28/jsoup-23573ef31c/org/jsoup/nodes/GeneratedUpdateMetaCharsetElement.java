package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedUpdateMetaCharsetElement {

    @Test
    public void updateMetaCharsetElement() {
        Document document = new Document("https://www.example.com");
        boolean updated = document.updateMetaCharsetElement();
        assertTrue(updated);
    }

}