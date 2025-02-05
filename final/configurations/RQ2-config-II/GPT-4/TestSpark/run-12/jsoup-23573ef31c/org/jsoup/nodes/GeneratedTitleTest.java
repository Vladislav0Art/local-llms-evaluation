package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = new Document("http://localhost");
        document.title("Title");
        assertEquals("Title", document.title());
    }

}