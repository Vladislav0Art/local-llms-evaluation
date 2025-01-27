package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedNodeName_AreNullWhenDataIsEmpty {

    @Test
    public void nodeName_AreNullWhenDataIsEmpty() {
        Comment comment = new Comment("");
        assert comment.nodeName() == null;
    }

}