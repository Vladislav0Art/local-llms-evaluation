package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;

public class GeneratedParseInputBaseUriTest {

    @Test
    public void parseInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("xml parsing test", "baseUri");
        Assert.assertNotNull(document);
    }

}