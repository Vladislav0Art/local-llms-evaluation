package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        final Token.StartTag startTagToken = new Token.StartTag();
        startTagToken.nameAttr("test");
        final XmlTreeBuilder builder = new XmlTreeBuilder();

        boolean ret = builder.process(startTagToken);

        assertTrue(ret);
        assertTrue(builder.stack.size() > 0);
    }

}