package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCommentConstructMethodWithoutValidDataThrowsNullPointerException {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    @InjectMocks
    private Comment comment;

    @Test
    public void CommentConstructMethodWithoutValidDataThrowsNullPointerException() {
        // given
        comment = new Comment(null);
        // when & then
        assert comment.getData() == null;
        try {
            comment.nodeName();
            assert false : "Expected NullPointerException";
        } catch (NullPointerException e) {
            assert true;
        }
    }

}