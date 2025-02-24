package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.DocumentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedConnectionTest {

    @Test
    public void connectionTest() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        assertNotNull(document.connection());
    }

}