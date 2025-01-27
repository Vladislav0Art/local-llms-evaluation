package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedNodeName_IsData {

    @Test
    public void nodeName_IsData() {
        Comment comment = new Comment("data");
        assert commentnodeName(comment) == "data";
    }

    private String nodeName(Comment comment) {
        return comment.nodeName();
    }

}