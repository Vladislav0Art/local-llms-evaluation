package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestnodeName {

    @Mock
    private Document document;

    @Before
    public void setup() {
        parseSettings = new ParseSettings();
    }

    @Test
    public void testnodeName() {
        TestComment comment = new TestComment("comment data");
        assertEquals(comment.nodeName(), "comment");
    }

}