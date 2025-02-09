package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedPopStackToCloseOperationTest {

    @Test
    public void popStackToCloseOperationTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.StartTag("div"));
        builder.insert(new Token.StartTag("p"));
        builder.popStackToClose(new Token.EndTag("p"));
        Assert.assertEquals(1, builder.stack.size());
    }

}