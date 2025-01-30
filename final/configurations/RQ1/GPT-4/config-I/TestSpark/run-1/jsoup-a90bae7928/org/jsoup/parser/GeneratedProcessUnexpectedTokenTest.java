package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedProcessUnexpectedTokenTest {

    @Test
    public void processUnexpectedTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token(Tag.valueOf("Test"), String.valueOf("Test"));
        xmlTreeBuilder.process(token);
    }

}