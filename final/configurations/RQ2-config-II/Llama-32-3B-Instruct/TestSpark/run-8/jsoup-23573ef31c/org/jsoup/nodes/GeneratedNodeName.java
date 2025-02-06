package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedNodeName {

    @Test
    public void nodeName() {
        Document document = Jsoup.parse("<html><body></body></html>");
        assertEquals("HTML", document.nodeName());
    }

}