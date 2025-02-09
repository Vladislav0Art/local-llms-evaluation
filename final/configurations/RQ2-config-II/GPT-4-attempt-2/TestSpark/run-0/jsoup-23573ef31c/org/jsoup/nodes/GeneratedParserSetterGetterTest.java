package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParserSetterGetterTest {

    @Test
    public void parserSetterGetterTest() {
        Document document = new Document("http://example.com");
        Parser parser = Mockito.mock(Parser.class);
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}