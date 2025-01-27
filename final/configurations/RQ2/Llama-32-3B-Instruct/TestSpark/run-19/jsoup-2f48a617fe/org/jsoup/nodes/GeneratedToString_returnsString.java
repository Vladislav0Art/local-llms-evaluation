package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedToString_returnsString {

    @Test
    public void toString_returnsString() {
        Comment comment = new Comment("data");
        String result = comment.toString();
        AssertNotEquals("", result);
    }

}