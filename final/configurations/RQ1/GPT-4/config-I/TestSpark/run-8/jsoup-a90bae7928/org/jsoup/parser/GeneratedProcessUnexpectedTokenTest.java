package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessUnexpectedTokenTest {

    @Test
    public void processUnexpectedTokenTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        testObject.process(new org.jsoup.parser.Token() {
            @Override
            org.jsoup.parser.TokenType type() {
                return null;
            }
        });
    }

}