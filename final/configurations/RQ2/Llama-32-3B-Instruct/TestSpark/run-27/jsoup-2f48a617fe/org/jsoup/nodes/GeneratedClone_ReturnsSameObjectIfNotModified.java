package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedClone_ReturnsSameObjectIfNotModified {

    @Test
    public void clone_ReturnsSameObjectIfNotModified() {
        Comment comment = new Comment("some data");
        Comment clonedComment = comment.clone();
        assert clonedComment == comment;
        Mockito.verifyNoMethodCalls();
    }

}