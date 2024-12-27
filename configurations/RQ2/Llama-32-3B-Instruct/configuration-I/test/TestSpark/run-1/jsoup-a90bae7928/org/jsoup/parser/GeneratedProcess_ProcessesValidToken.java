package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedProcess_ProcessesValidToken {

    @Test
    public void process_ProcessesValidToken() {
        Token token = new Token(0, 10, "tag", "");
        assertTrue(new XmlTreeBuilder().process(token));
    }

}