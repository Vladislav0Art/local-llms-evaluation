package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("http://test.com");
        Parser parser = Parser.htmlParser();

        Document updatedDoc = doc.parser(parser);
        assertEquals(parser, updatedDoc.parser());
    }

}