package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParserSetAndGetTest {

    @Test
    public void parserSetAndGetTest() {
        Document doc = new Document("http://test.com");
        Parser parser = new Parser(new TreeBuilder());
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}