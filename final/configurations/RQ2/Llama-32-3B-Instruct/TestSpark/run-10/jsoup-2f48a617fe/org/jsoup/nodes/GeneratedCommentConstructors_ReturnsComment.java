package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedCommentConstructors_ReturnsComment {

    @Test
    public void commentConstructors_ReturnsComment() {
        Comment comment = new Comment("data");
        assert comment != null;
    }

}