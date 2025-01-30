package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTextTest {

    private static final String BASE_URI = "http://example.com/";

    @Test
    public void textTest() {
        Document document = new Document(BASE_URI);
        String text = "Test text";
        document.text(text);
        assertEquals(document.body().text(), text);
    }

}