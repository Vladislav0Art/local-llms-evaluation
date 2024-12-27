package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedProcess ProcessesInvalidToken_ThrowsException {

    @Test
    public void process

    ProcessesInvalidToken_ThrowsException() {
        Token token = new Token(0, 10, null, "");
        try {
            new XmlTreeBuilder().process(token);
            fail("Expected an exception");
        } catch (AssertionError e) {
            // Expected
        }
    }

}