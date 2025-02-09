package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com/");
        doc.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), doc.charset());
    }

}