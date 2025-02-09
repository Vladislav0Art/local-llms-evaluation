package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = Parser.xmlParser();
        Assert.assertEquals(1, xmlTreeBuilder.parseFragment("<test>Test Fragment</test>", "", parser).size());
    }

}