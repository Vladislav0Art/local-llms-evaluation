package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCharsetSetSuccessTest {

    @Test
    public void charsetSetSuccessTest() {
        Document document = Document.createShell("https://www.example.com");
        document.charset(Charset.forName("UTF-8"));
        String finalCharset = document.charset().name();
        assertEquals("UTF-8", finalCharset);
    }

}