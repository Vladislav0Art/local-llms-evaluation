package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedFramesetFrameElementIsInsertedCorrectly {

    @Test
    public void framesetFrameElementIsInsertedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Token token = new Token();
        assertTrue(builder.framesetOk(token));
    }

}