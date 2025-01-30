package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAsStringWithMapPropertiesTest {

    @Test
    public void asStringWithMapPropertiesTest() {
        Document documentMock = mock(Document.class);
        Map<String, String> props = new HashMap<>();
        props.put("doctype-public", "<!DOCTYPE html>");
        W3CDom w3CDom = spy(W3CDom.class);
        assertNotNull(w3CDom.asString(documentMock, props));
    }

}