package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("");
        document.charset(java.nio.charset.Charset.forName("UTF-8"));
        assertNotNull(document.charset());
    }

}