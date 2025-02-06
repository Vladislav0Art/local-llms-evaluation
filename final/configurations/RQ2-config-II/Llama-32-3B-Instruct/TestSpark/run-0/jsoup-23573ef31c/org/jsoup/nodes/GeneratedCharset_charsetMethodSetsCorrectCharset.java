package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCharset_charsetMethodSetsCorrectCharset {

    @Test
    public void charset_charsetMethodSetsCorrectCharset() {
        Charset expectedCharset = Charset.forName("UTF-8");
        Document document = Document.createShell("https://www.example.com");
        document.charset(expectedCharset);
        assertEquals(expectedCharset, document.charset());
    }

}