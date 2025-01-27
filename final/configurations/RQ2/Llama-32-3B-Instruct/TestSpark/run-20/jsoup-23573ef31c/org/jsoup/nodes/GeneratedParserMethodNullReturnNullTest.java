package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedParserMethodNullReturnNullTest {

    @Test
    public void parserMethodNullReturnNullTest() {
        Document document = Document.createShell("https://www.example.com");
        Parser parser = document.parser();
        assertNull(parser);
    }

}