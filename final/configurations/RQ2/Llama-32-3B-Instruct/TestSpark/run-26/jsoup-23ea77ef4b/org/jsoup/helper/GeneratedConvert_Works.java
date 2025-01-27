package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedConvert_Works {

    @Test
    public void convert_Works() {
        Document in = Document.createDocumentBuilder().newDocument();
        Document out = new Document();
        W3CDom w3c = new W3CDom();
        w3c.convert(in, out);
        assertEquals(out, w3c.fromJsoup(in));
    }

}