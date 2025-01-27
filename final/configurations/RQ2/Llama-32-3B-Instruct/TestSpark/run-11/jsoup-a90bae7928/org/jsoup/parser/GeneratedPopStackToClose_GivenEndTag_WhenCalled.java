package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedPopStackToClose_GivenEndTag_WhenCalled {

    @Test
    public void popStackToClose_GivenEndTag_WhenCalled() {
        // given
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.EndTag endTag = Token.EndTag.ROOT;

        // when
        builder.popStackToClose(endTag);

        // then
        assertTrue(builder.process(endTag) == true);
    }

}