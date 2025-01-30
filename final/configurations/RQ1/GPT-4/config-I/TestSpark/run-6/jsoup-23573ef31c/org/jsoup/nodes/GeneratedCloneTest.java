package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCloneTest {

    private static final String BASE_URI = "http://example.com/";

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Document document = new Document(BASE_URI);
        Document cloned = document.clone();
        assertFalse(document == cloned);
        assertEquals(document.outputSettings().charset(), cloned.outputSettings().charset());
        assertEquals(document.updateMetaCharsetElement(), cloned.updateMetaCharsetElement());
    }

}