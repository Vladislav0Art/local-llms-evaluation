package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.jsoup.Jsoup;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessInvalidTokenTest {

    @Test
    public void processInvalidTokenTest() {
        try {
            Token token = Token.EOF;
            XmlTreeBuilder builder = new XmlTreeBuilder();
            builder.process(token);
        } catch (Exception e) {
            fail("Test failed due to exception: " + e.getMessage());
        }
    }

}