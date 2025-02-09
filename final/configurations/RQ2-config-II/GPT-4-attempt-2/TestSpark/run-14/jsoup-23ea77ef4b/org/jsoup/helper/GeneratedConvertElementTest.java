package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertElementTest {

    @Test
    public void convertElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = new Element("test");
        Document wDocument = Mockito.mock(Document.class);
        w3cDom.convert(element, wDocument);
        Mockito.verify(wDocument, Mockito.times(1)).appendChild(Mockito.any());
    }

}