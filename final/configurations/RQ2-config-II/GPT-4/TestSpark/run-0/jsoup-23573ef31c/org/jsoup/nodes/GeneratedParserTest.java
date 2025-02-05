package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document document = new Document("http://test.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertSame(parser, document.parser());
    }

}