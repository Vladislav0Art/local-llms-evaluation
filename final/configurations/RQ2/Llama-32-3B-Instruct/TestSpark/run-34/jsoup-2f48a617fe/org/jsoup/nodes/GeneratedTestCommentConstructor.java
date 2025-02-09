package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

public class GeneratedTestCommentConstructor {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public static final String TEST_DATA = "Test Data";

    @BeforeClass
    public static void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @AfterClass
    public static void teardown() {
        // No-op
    }

    @Test
    public void testCommentConstructor() {
        Comment comment = new Comment(TEST_DATA);
        assertEquals(TEST_DATA, comment.getData());
    }

}