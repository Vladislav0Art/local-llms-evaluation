package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedConvertNullInDocumentTest {

    @Test
    public void convertNullInDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(null, null);
    }

}