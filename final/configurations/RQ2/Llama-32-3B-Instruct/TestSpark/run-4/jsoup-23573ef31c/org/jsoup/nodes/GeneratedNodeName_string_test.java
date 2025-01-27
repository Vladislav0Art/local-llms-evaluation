package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedNodeName_string_test {

    @Test
    public void nodeName_string_test() {
        Document document = new Document();
        assertEquals("", document.nodeName());
    }

}