package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedNodeName_ReturnsCorrectNodeName {

    @Test
    public void nodeName_ReturnsCorrectNodeName() {
        String nodeName = "html";
        Document document = Jsoup.parse("<html></html>");
        assertEquals(nodeName, document.nodeName());
    }

}