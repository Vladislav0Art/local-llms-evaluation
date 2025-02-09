package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedLocationReturnsNull DocumentEmpty {

    @Test
    public void locationReturnsNull

    DocumentEmpty() {
        Document document = new Document("https://example.com");
        assertNull(document.location());
    }

}