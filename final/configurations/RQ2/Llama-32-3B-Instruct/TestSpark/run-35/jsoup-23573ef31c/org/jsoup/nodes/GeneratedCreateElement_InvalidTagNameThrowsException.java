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
public class GeneratedCreateElement_InvalidTagNameThrowsException {

    @Mock
    private Connection connection;

    @Test
    public void createElement_InvalidTagNameThrowsException() {
        String tagName = "@invalid@";
        org.junit.Assert.assertThrows(IllegalArgumentException.class, () -> new Document("https://www.example.com").createElement(tagName));
    }

}