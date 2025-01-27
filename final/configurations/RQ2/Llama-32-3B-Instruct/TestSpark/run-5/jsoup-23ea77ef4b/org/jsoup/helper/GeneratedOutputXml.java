package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedOutputXml {

    @Test
    public void OutputXml() {
        Document doc = new org.jsoup.nodes.Document();
        when(org.jsoup.nodes.Document.OutputSettings.Syntax.class).thenReturn(new org.jsoup.nodes.Document.OutputSettings(Syntax.XML));
        Map<String, String> result = W3CDom.OutputXml();
        assertEquals(1, result.size());
    }

}