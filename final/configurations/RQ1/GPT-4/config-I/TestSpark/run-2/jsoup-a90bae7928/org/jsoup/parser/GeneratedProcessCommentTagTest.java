package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class GeneratedProcessCommentTagTest {

    @Test
    public void processCommentTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.Comment();
        token.asComment().data("comment");
        boolean result = xmlTreeBuilder.process(token);
        assertTrue(result);
    }

}