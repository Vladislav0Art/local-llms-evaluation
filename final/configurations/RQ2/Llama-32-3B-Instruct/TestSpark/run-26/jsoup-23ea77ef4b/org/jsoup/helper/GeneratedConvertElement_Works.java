package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedConvertElement_Works {

    @Test
    public void convertElement_Works() {
        Element in = new Element("div");
        Document out = new Document();
        W3CDom w3c = new W3CDom();
        w3c.convert(in, out);
        assertEquals(out, w3c.fromJsoup(in));
    }

}