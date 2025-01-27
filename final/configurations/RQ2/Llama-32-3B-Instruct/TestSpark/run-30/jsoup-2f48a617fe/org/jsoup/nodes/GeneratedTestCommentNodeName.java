package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

public class GeneratedTestCommentNodeName {

    @Test
    public void testCommentNodeName() {
        Document document = new Document();
        Element commentElement = document.createElement("comment");
        commentElement.setName("comment");
        assertThat(commentElement.getName(), is("comment"));
    }

}