package org.jsoup.nodes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Comment comment = new Comment("test");
        String result = comment.toString();
        assertEquals("<!--#comment-->test", result);
    }

}