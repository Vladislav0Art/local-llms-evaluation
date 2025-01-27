package org.jsoup.nodes;

public class GeneratedOuterHtmlTailCommentNotImplementedTest {

    @Test
    public void outerHtmlTailCommentNotImplementedTest() {
        assertThrows(UnsupportedOperationException.class, () -> new Comment("").outerHtmlTail(null, 0, null));
    }

}