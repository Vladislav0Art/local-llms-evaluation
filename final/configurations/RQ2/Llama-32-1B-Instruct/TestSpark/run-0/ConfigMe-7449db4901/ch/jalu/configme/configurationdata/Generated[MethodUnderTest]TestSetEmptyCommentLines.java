package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import org.junit.Test;
import org.mockito.Mockito;

public class Generated[MethodUnderTest]

TestSetEmptyCommentLines {

    @Test
    public void [MethodUnderTest]TestSetEmptyCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.singletonList(new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

}