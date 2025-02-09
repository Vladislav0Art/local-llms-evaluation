package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElementDoc {

    @Test
    public void convertElementDoc() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Element element = in.body().appendNode(new org.jsoup.nodes.Element());
        Document out = W3CDom.convert(element, in);
        assertTrue(out.contains("<html><body><div></div></body></html>"));
    }

}