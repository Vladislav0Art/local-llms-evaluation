package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        JsdslComment comment = new JsdslComment("#comment");
        comment.outerHtmlHead(Mockito.mock(Appendable.class), 0, ParseSettings.parseDefault());
        assertEquals("<!-- #comment -->", comment.toString());
    }

}