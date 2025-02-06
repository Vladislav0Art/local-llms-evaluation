package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

public class GeneratedNodeName_returnsCorrectName {

    @Test
    public void nodeName_returnsCorrectName() {
        Comment comment = new Comment("data");
        assertThat(comment.nodeName(), is("COMMENT"));
    }

}