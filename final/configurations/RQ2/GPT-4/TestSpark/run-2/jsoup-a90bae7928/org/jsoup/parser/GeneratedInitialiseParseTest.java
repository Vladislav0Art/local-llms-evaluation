package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.util.List;
import java.io.StringReader;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<node>test</node>");

        builder.initialiseParse(reader, "http://base.uri", Parser.xmlParser());
    }

}