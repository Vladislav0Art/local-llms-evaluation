package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedShallowClone_ReturnsShallowClonedDocument {

    @Test
    public void shallowClone_ReturnsShallowClonedDocument() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection.url());
        Document cloned = document.shallowClone();
        assertNotNull(cloned);
    }

}