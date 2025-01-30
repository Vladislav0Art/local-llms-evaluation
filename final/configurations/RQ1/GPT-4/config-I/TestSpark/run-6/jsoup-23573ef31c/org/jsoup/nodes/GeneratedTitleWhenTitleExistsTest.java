package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTitleWhenTitleExistsTest {

    private static final String BASE_URI = "http://example.com/";

    @Test
    public void titleWhenTitleExistsTest() {
        Document document = new Document(BASE_URI);
        String titleName = "testTitle";
        document.appendElement("html").appendElement("head").appendElement("title").text(titleName);
        assertEquals(document.title(), titleName);
    }

}