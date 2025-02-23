package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        String nodeName = comment.nodeName();
        Assert.assertEquals("#comment", nodeName);
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        String data = comment.getData();
        Assert.assertEquals("data", data);
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        Comment newComment = comment.setData("newData");
        String data = newComment.getData();
        Assert.assertEquals("newData", data);
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable accum = Mockito.mock(Appendable.class);
        comment.outerHtmlHead(accum, 0, Document.OutputSettings.create().prettyPrint(true));
        Mockito.verify(accum).append("<!--data-->");
    }

}