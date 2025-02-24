package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document document = new Document("http://example.com");
        Element form = document.expectForm("form");
        assert form == null;
    }

}