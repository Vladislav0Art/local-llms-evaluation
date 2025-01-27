package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNodeName_isNotNull {

    @Test
    public void nodeName_isNotNull() {
        Comment comment = new Comment("data");
        AssertNotNull(comment.nodeName());
    }

}