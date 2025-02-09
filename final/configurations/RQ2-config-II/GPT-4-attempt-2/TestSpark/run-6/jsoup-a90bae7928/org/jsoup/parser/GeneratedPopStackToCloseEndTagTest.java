package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedPopStackToCloseEndTagTest {

    @Test
    public void popStackToCloseEndTagTest() {
        Token.EndTag endTag = new Token.EndTag();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.popStackToClose(endTag);
    }

}