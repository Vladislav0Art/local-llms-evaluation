package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        org.jsoup.nodes.Element element = org.jsoup.Jsoup.parse("<p>Hello World!</p>").get(0).selectFirst("p");
        Document convertedDoc = W3CDom.fromJsoup(element);
        assertNotNull(convertedDoc);
    }

}