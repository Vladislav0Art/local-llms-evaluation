package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessEndTagTest {

    @Test
    public void ProcessEndTagTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        EndTag endTag = new EndTag("test");
        Token testToken = new Token(endTag);
        assertTrue(testObject.process(testToken));
    }

}