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

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        JsdslComment comment = new JsdslComment("#comment");
        comment.outerHtmlTail(Mockito.mock(Appendable.class), 0, ParseSettings.parseDefault());
        assertEquals("", comment.toString());
    }

}