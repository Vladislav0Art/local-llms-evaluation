package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedClone_ReturnsComment {

    @Test
    public void clone_ReturnsComment() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        assert cloned != null;
    }

}