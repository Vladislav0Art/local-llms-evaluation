package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.Connection;
import org.jsoup.html.parser.HtmlParserBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;

public class GeneratedAppendKeyVal_MultipleFields {

    @Test
    public void appendKeyVal_MultipleFields() throws UnsupportedEncodingException {
        String key1 = "field1";
        String key2 = "field2";
        String value1 = "value1";
        String value2 = "value2";
        UrlBuilder builder = new UrlBuilder(new URI("http://example.com"));
        builder.appendKeyVal(KeyUtil.fromString(key1, key2), value1, value2);
        assertEquals(IDN.toNumber(key1), getIDNValue(builder.build()));
    }

}