package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;

public class GeneratedFramesetOkTest {

    @Test
    public void framesetOkTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.framesetOk(true);

        assertTrue(builder.framesetOk());
    }

}