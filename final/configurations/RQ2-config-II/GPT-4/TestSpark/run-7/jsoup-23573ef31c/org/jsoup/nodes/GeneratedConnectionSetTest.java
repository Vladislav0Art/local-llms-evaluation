package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.FormElement;

import java.nio.charset.Charset;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class GeneratedConnectionSetTest {

    @Test
    public void connectionSetTest() {
        Document document = new Document("http://example.com");
        Connection connection = Jsoup.connect("http://example.com");
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}