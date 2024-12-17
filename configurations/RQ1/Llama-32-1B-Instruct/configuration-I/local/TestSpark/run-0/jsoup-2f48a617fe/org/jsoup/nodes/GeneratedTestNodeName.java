package org.jsoup.nodes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("#comment");
        assertEquals("Comment", comment.nodeName());
    }

}