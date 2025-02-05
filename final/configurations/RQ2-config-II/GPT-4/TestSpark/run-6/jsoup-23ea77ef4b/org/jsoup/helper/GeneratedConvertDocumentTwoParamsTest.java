package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentTwoParamsTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void convertDocumentTwoParamsTest() {
        Document in = new Document("example");
        W3CDocument out = w3CDom.fromJsoup(in);
        w3CDom.convert(in, out);
    }

}