package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "p";
        xmlTreeBuilder.insert(endTag);
        xmlTreeBuilder.popStackToClose(endTag);
        Assert.assertTrue(xmlTreeBuilder.stack.isEmpty());
    }

}