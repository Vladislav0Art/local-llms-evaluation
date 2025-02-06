package org.jsoup.nodes;

import org.junit.Test;
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

public class GeneratedUpdateMetaCharsetElementMethod_SetsUpdateFlag {

    @Test
    public void updateMetaCharsetElementMethod_SetsUpdateFlag() {
        Document document = Document.createShell("http://example.com");
        boolean updated = document.updateMetaCharsetElement();
        assertTrue(updated);
    }

}