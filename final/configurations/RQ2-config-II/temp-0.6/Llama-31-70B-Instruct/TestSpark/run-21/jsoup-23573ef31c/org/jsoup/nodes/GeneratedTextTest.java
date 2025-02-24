package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Document document = new Document("http://example.com");
        document.text("New Text");
        assert document.text().equals("New Text");
    }

}