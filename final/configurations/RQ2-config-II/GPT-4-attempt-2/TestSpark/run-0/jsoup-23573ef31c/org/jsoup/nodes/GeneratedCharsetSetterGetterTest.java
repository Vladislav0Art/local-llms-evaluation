package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCharsetSetterGetterTest {

    @Test
    public void charsetSetterGetterTest() {
        Document document = new Document("http://example.com");
        Charset charset = StandardCharsets.UTF_8;
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}