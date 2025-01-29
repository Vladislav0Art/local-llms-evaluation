package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetData {

    @Mock
    private Document document;

    @Before
    public void setup() {
        parseSettings = new ParseSettings();
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("comment data");
        assertEquals(comment.getData(), "");
    }

}