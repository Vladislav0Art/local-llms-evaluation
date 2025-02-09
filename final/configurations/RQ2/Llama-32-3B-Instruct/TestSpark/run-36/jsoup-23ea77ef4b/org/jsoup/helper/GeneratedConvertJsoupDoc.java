package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertJsoupDoc {

    @Test
    public void convertJsoupDoc() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document out = W3CDom.convert(in);
        assertNotNull(out);
    }

}