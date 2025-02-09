package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document document = new Document("");
        document.parser(Parser.htmlParser());
        Assert.assertEquals(Parser.htmlParser().getClass(), document.parser().getClass());
    }

}