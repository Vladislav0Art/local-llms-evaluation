package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessStartTagTest {

    @Test
    public void ProcessStartTagTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        StartTag startTag = new StartTag("test");
        Token testToken = new Token(startTag);
        assertTrue(testObject.process(testToken));
    }

}