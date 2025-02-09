package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNodeNameReturnsEmptyString DocumentEmpty {

    @Test
    public void nodeNameReturnsEmptyString

    DocumentEmpty() {
        Document document = new Document("https://example.com");
        assertEquals("", document.nodeName());
    }

}