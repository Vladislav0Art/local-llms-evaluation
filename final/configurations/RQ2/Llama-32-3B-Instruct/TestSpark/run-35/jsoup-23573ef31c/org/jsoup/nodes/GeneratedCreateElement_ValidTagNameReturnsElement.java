package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateElement_ValidTagNameReturnsElement {

    @Mock
    private Connection connection;

    @Test
    public void createElement_ValidTagNameReturnsElement() {
        String tagName = "p";
        Element element = new Document("https://www.example.com").createElement(tagName);
        org.junit.Assert.assertNotNull(element);
        org.junit.Assert.assertEquals(tagName, element.nodeName());
    }

}