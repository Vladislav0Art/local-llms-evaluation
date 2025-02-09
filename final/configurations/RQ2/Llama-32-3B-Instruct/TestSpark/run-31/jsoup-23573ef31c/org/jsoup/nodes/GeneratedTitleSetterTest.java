package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTitleSetterTest {

    @Test
    public void titleSetterTest() {
        Document document = new Document();
        document.title("test");
        assertEquals("test", document.title());
    }

}