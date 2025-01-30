package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.mockito.Mockito.*;

public class GeneratedParseInputBaseUriTest {

    @Test
    public void parseInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<test></test>";
        String baseUri = "http://test.com";
        Document document = xmlTreeBuilder.parse(new StringReader(input), baseUri);

        Assert.assertEquals("Check baseUri of parsed document", baseUri, document.baseUri());
        Assert.assertTrue("Check if document has root element with name 'test'", document.select("test").size() == 1);
    }

}