package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertInOutDocumentTest {

    @Test
    public void convertInOutDocumentTest() {
        Document out = W3CDom.convert(new Document("http://test.org"));
        Document in = W3CDom.convert(new Document("http://test2.org"));
        new W3CDom().convert(in, out);
        assertEquals(out, in);
    }

}