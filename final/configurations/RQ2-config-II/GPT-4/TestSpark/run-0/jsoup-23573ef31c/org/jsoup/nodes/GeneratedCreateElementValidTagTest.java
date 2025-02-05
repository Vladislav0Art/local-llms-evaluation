package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateElementValidTagTest {

    @Test
    public void createElementValidTagTest() {
        Document document = new Document("http://test.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

}