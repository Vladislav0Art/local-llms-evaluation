package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedCharsetSetsCharset {

    @Test
    public void charsetSetsCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell("https://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}