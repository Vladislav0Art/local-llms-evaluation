package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectXpathStringDocument {

    @InjectMocks
    private W3CDom w3cdom;

    @Mock
    private Document document;

    @Mock
    private Element element;

    @Test
    public void selectXpathStringDocument() {
        NodeList nodeList = new NodeList();
        when(document.getXPathResult(any(), any())).thenReturn(nodeList);
        NodeList result = w3cdom.selectXpath("xpath", document);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}