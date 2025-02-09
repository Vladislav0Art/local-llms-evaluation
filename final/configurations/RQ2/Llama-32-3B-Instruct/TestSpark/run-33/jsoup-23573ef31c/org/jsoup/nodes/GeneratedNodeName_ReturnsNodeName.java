package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedNodeName_ReturnsNodeName {

    @Test
    public void nodeName_ReturnsNodeName() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection.url());
        String node_name = document.nodeName();
        assertNotNull(node_name);
    }

}