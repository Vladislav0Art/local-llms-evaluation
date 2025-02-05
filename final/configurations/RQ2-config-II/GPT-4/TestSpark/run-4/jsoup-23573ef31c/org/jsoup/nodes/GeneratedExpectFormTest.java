package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document document = new Document("https://www.example.com");
        document.expectForm("form");
    }

}