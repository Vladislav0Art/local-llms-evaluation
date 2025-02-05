package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        assertTrue(W3CDom.OutputHtml() instanceof HashMap);
    }

}