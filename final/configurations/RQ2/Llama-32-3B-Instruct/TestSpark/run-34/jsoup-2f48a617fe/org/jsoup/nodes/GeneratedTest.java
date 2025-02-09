package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTest {

    private Document document;

    @BeforeClass
    public static void initMocks() {
        String html = "<document><outputSettings><settings></settings></outputSettings></document>";
        document = Jsoup.parse(html);
    }

    public Document getDocument() {
        return document;
    }

    public static final String TEST_DATA = "<--!>";

}