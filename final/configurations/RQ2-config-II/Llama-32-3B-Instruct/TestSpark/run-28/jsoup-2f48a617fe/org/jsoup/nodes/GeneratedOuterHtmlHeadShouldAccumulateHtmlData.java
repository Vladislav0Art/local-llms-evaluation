package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadShouldAccumulateHtmlData {

    @Test
    public void outerHtmlHeadShouldAccumulateHtmlData() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document document = new Document();
        Comment comment = new Comment("");
        comment.setNodeElement(document.createElement("div"));
        comment.outerHtmlHead(accum, 0, null);
        accum.assertValueContains("<div>");
    }

}