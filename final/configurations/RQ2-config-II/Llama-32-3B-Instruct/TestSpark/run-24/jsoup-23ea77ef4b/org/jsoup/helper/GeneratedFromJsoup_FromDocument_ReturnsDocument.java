package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedFromJsoup_FromDocument_ReturnsDocument {

    @Test
    public void fromJsoup_FromDocument_ReturnsDocument() {
        Document in = new Document();
        Document out = W3CDom.fromJsoup(in).getDocument();
        assertEquals(in, out);
    }

}