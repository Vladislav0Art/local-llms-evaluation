package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessDoctypeTest {

    @Test
    public void ProcessDoctypeTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        Doctype doctype = new Doctype("testTitle", "testPublicId", "testSystemId", "testPubSysKey");
        Token testToken = new Token(doctype);
        assertTrue(testObject.process(testToken));
    }

}