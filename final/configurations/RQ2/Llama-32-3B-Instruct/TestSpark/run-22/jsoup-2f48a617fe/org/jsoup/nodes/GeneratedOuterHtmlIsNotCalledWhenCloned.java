package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public class GeneratedOuterHtmlIsNotCalledWhenCloned {

    @Test
    public void outerHtmlIsNotCalledWhenCloned() {
        Document document = new Document();
        Appendable accum = new ByteArrayOutputStream();
        int depth = 0;
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        clonedComment.outerHtmlHead(accum, depth, new Document.OutputSettings());
        assertThat(document.getOuterHTML(), is(""));
    }

}