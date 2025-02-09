package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Assert.assertTrue(builder.process(new Token.StartTag()));
        Assert.assertTrue(builder.process(new Token.Character("a")));
        Assert.assertTrue(builder.process(new Token.Comment()));
        Assert.assertTrue(builder.process(new Token.Doctype()));
    }

}