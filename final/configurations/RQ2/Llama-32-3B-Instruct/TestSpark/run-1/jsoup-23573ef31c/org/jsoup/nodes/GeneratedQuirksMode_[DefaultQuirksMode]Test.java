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

import javax.annotation.Nullable;

public class GeneratedQuirksMode_[DefaultQuirksMode]

Test {

    @Test
    public void quirksMode_[ DefaultQuirksMode]Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        QuirksMode mode = document.quirksMode();
        assertEquals(QuirksMode.CRUSH, mode);
    }

}