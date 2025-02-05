package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTitleSetAndGetTest {

    @Test
    public void titleSetAndGetTest() {
        Document doc = new Document("http://test.com");
        doc.title("Test");
        assertEquals("Test", doc.title());
    }

}