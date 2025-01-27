package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedGetData_ReturnsData {

    @Test
    public void getData_ReturnsData() {
        Comment comment = new Comment("data");
        assert comment.getData().equals("data");
    }

}