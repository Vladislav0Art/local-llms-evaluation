package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedSetData_ReturnsCommentWithNewData {

    @Test
    public void setData_ReturnsCommentWithNewData() {
        Comment comment = new Comment("old_data");
        comment.setData("new_data");
        assert comment.getData().equals("new_data");
    }

}