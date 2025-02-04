package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_AppendsXmlDeclarationToOutputIfPrettyPrinted {

    @Test
    public void outerHtmlHead_AppendsXmlDeclarationToOutputIfPrettyPrinted() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, 0, out);
        String output = accum.toString();
        assertTrue(output.contains("<!--"));
    }

}