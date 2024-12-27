package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedProcess_PassesInvalidToken_NoExceptionThrown {

    @Test
    public void process_PassesInvalidToken_NoExceptionThrown() {
        Token token = new Token(0, 10, null, "");
        boolean result = new XmlTreeBuilder().process(token);
        assertTrue(result);
    }

}