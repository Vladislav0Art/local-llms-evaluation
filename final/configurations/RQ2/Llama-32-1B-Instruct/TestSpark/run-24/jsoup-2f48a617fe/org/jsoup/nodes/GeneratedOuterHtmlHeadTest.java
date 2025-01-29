package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        ParseSettings parseSettings = new ParseSettings();
        parseSettings.add("http://www.w3.org/1999/XLink", "xlink");
        String data = "This is a test comment";
        when(Mockito.mock(Parser.class)).thenReturn(parseSettings);

        new Comment(data).outerHtmlHead(Mockito.mock(Appendable.class), 0, Document.OutputSettings());
    }

}