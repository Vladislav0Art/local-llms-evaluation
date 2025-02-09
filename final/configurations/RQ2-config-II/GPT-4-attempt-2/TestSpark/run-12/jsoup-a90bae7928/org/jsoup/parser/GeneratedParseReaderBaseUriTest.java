package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;

public class GeneratedParseReaderBaseUriTest {

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("reading xml parsing test"), "baseUri");
        Assert.assertNotNull(document);
    }

}