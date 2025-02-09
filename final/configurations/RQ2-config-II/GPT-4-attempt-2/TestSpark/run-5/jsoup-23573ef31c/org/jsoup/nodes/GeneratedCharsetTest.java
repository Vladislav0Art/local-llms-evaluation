package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        doc.charset(StandardCharsets.UTF_8);
        Charset charset = doc.charset();
        Assert.assertEquals(StandardCharsets.UTF_8, charset);
    }

}