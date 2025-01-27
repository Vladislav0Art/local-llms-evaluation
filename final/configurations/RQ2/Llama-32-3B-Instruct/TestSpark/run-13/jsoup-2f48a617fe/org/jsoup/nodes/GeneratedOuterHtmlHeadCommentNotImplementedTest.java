package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadCommentNotImplementedTest {

    @Test
    public void outerHtmlHeadCommentNotImplementedTest() {
        assertThrows(UnsupportedOperationException.class, () -> new Comment("").outerHtmlHead(null, 0, null));
    }

}