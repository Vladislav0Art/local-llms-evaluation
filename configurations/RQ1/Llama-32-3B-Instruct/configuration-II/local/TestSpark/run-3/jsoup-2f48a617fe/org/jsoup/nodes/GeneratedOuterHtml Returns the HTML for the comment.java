package org.jsoup.nodes;

public class GeneratedOuterHtml Returns the HTML for
the comment {

@Test
public void outerHtml
Returns the
HTML for

the comment() {
    Appendable accum = mock(Appendable.class);
    int depth = 0;
    Document.OutputSettings out = mock(Document.OutputSettings.class);
    Comment comment = new Comment("data");
    comment.outerHtmlHead(accum, depth, out);
    assertEquals("<!--data-->", accum.toString());
}

}