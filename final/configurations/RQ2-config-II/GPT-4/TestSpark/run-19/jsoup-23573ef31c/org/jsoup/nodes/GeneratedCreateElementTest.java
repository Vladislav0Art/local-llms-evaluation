package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        String tagName = "p";
        Document doc = new Document("https://google.com");
        Element createdElement = doc.createElement(tagName);
        Assert.assertEquals(tagName, createdElement.tagName());
    }

}