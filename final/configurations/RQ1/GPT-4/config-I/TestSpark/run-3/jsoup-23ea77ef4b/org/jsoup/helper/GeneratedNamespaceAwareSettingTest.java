package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.transform.TransformerException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareSettingTest {

    @Test
    public void namespaceAwareSettingTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(false);
        assertFalse(w3CDom.namespaceAware());
    }

}