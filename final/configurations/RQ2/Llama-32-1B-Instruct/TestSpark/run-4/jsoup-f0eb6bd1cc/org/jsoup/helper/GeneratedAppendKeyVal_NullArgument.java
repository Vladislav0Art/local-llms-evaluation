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

public class GeneratedAppendKeyVal_NullArgument {

    @Test
    public void appendKeyVal_NullArgument() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNull(builder.appendKeyVal(null));
    }

    private String getIDNValue(URL url) {
        URI uri = URLDecoder.decode(url.toString(), UTF_8);
        return IDN.toNumber(uri.getScheme());
    }

}