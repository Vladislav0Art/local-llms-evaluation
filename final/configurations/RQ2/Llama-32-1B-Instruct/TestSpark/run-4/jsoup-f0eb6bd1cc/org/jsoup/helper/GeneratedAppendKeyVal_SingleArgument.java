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

public class GeneratedAppendKeyVal_SingleArgument {

    @Test
    public void appendKeyVal_SingleArgument() throws UnsupportedEncodingException {
        String key = "field";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new URI("http://example.com"));
        builder.appendKeyVal(KeyUtil.fromString(key, value));
        assertEquals(IDN.toNumber(key), getIDNValue(builder.build()));
    }

}