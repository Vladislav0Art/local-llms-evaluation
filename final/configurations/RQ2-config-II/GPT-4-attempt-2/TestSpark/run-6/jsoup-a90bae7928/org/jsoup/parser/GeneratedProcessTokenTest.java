package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();

        boolean processResult = xmlTreeBuilder.process(commentToken);
        Assert.assertTrue(processResult);
    }

}