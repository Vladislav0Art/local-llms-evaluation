package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class GeneratedFromJsoupNullElementTest {

    @Test
    public void fromJsoupNullElementTest() {
        W3CDom w3CDom = new W3CDom();
        Element element = null;
        w3CDom.fromJsoup(element);
    }

}