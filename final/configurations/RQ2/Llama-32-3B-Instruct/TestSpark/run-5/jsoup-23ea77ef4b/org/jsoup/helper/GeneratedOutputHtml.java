package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedOutputHtml {

    @Test
    public void OutputHtml() {
        Document doc = new org.jsoup.nodes.Document();
        when(org.jsoup.nodes.Document.OutputSettings.Syntax.class).thenReturn(new org.jsoup.nodes.Document.OutputSettings(Syntax.HTML));
        Map<String, String> result = W3CDom.OutputHtml();
        assertEquals(1, result.size());
    }

}