package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Connection;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.OutputSettings;
import org.jsoup.nodes.Parser;
import org.jsoup.nodes.QuirksMode;
import org.jsoup.options.Charset;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCharset_setCharset {

    @Test
    public void charset_setCharset() {
        Document document = new Document("http://example.com");
        Charset charset = "UTF-8";
        document.charset(charset);
        assertTrue(document.charset() == charset);
    }

}