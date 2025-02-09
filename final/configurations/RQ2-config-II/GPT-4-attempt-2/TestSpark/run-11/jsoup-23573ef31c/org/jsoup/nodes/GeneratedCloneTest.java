package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        Document cloned = doc.clone();

        assertTrue(cloned != doc && cloned.location().equals(doc.location()));
    }

}