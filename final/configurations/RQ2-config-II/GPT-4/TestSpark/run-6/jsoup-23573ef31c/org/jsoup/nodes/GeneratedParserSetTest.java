package org.jsoup.nodes;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.when;

public class GeneratedParserSetTest {

    @Test
    public void parserSetTest() {
        Document document = new Document("http://localhost");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

}