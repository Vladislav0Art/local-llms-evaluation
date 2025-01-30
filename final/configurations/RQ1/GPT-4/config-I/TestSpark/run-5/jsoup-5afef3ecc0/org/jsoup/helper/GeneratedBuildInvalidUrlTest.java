package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() throws Exception {
        URL url = new URL("wrong.example");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

}