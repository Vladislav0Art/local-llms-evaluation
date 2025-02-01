package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedPopStackToCloseTest_endTagNotFound {

    @Test
    public void popStackToCloseTest_endTagNotFound() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.stack.add(new Element(Tag.valueOf("p"), ""));
        xmlTreeBuilder.popStackToClose(new Token.EndTag("div"));
        Assert.assertEquals(1, xmlTreeBuilder.stack.size());
    }

}