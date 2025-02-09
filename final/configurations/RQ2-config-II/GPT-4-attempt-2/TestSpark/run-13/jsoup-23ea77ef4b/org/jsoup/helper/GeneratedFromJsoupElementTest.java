package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        org.jsoup.nodes.Element elementMock = Mockito.mock(org.jsoup.nodes.Element.class);
        W3CDom w3CDom = new W3CDom();
        assertNotNull(w3CDom.fromJsoup(elementMock));
    }

}