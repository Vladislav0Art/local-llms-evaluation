package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Mock
    ParseSettings parseSettings;

    @Mock
    Parser parser;

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("comment");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, parseSettings);
        assertEquals("<!--comment-->", sb.toString());
    }

}