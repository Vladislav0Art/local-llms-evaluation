package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedIsContentForTagDataTest {

    @Test
    public void isContentForTagDataTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        boolean result = builder.isContentForTagData("test");
        assertFalse(result);
    }

}