package org.jsoup.nodes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("test");
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

}