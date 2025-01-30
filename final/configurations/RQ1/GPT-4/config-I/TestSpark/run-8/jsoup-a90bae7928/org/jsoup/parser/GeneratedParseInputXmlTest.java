package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseInputXmlTest {

    @Test
    public void parseInputXmlTest() {
        Document xmlDoc = Jsoup.parse("<tag><subTag>Test content</subTag></tag>", "", Parser.xmlParser());
        assertEquals("<tag>\n <subTag>Test content</subTag>\n</tag>", xmlDoc.toString());
    }

}