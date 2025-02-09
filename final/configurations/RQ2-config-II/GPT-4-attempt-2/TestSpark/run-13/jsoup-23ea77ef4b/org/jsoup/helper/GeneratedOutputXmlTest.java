package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputXmlTest {

    @Test
    public void OutputXmlTest() {
        assertNotNull(W3CDom.OutputXml());
    }

}