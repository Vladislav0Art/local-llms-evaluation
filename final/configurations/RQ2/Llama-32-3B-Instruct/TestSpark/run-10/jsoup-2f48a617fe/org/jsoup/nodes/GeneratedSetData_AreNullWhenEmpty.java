package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedSetData_AreNullWhenEmpty {

    @Test
    public void setData_AreNullWhenEmpty() {
        Comment comment = new Comment("");
        comment.setData("");
        assert comment.getData() == null;
    }

}