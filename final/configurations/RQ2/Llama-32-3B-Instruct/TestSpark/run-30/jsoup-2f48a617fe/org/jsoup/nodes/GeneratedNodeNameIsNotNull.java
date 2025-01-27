package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;

public class GeneratedNodeNameIsNotNull {

    @Test
    public void nodeNameIsNotNull() {
        Comment comment = new Comment("data");
        assertThat(comment.nodeName(), is("COMMENT"));
    }

}