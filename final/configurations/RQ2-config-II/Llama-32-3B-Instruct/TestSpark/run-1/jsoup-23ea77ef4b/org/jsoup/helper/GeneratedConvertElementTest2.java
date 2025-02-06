package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElementTest2 {

    @Test
    public void convertElementTest2() {
        org.jsoup.nodes.Element element = org.jsoup.Jsoup.parse("<p>Hello World!</p>").get(0).selectFirst("p");
        Document out = new org.jsoup.internal.Parser().parse(element, "html");
        W3CDom.convert(element, out);
        assertNotNull(out);
    }

}