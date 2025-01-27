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

public class GeneratedSetAndVerifyParentOfComment {

    @Test
    public void setAndVerifyParentOfComment() {
        Comment comment = new Comment("");
        Element parent = new Element("test");
        comment.setData("<!-- " + parent.getOuterHTML() + " -->");
        Comment clonedComment = comment.clone();
        assertThat(clonedComment.getData(), is(parent));
    }

}