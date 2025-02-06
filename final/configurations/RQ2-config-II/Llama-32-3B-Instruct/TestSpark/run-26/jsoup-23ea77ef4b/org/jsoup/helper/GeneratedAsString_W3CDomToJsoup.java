package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.Selector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedAsString_W3CDomToJsoup {

    @Test
    public void asString_W3CDomToJsoup() {
        Document doc = mock(Document.class);
        String str = W3CDom.asString(doc, Collections.emptyMap());

        when(doc.getDocumentElement()).thenReturn(mock(Element.class));
        assertNotNull(str);
        assertTrue(str.contains("<"));
    }

}