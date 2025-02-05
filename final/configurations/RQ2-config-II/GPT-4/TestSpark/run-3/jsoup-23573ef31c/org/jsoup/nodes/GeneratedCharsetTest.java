package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCharsetTest {

    @Mock
    private Connection mockConnection;

    @Test
    public void charsetTest() {
        Document doc = new Document("https://example.com");
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

}