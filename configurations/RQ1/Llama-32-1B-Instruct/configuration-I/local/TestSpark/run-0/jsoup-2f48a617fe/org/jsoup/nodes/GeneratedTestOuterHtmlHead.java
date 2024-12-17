package org.jsoup.nodes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Comment comment = new Comment("");
        Assert.assertTrue(comment.outerHtmlHead(ParseSettings.defaultParser(), 0, null).contains("<!--#comment-->"));
        Assert.assertFalse(comment.outerHtmlHead(ParseSettings.defaultParser(), 1, null).contains(""));
    }

}