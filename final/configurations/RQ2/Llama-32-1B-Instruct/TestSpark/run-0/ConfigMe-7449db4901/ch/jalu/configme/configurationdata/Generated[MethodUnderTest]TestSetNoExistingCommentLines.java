package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import org.junit.Test;
import org.mockito.Mockito;

public class Generated[MethodUnderTest]

TestSetNoExistingCommentLines {

    @Test
    public void [MethodUnderTest]TestSetNoExistingCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(Collections.emptyList());
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment1\ncomment2");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

}