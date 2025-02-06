package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document document = new Document();
        Element parentElement = Mockito.mock(Element.class);
        OutputSettings out = new OutputSettings();
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone(parentElement, out);
        // assertion code here
    }

}