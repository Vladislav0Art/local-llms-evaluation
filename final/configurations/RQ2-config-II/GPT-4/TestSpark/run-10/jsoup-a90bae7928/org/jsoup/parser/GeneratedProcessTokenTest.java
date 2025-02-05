package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        // Scenario: Processing a token
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.Character();
        token.setValue("Some value");
        boolean result = xmlTreeBuilder.process(token);
        Assert.assertTrue(result);
    }

}