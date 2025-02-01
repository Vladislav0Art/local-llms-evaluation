package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        Token.StartTag startTagToken = new Token.StartTag();
        startTagToken.nameAttr("test");
        xmlTreeBuilder.process(startTagToken);

        Token.EndTag endTagToken = new Token.EndTag();
        endTagToken.nameAttr("test");
        xmlTreeBuilder.process(endTagToken);

        Assert.assertFalse(xmlTreeBuilder.doc.body().hasText());
    }

}