package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import org.junit.Test;
import org.mockito.Mockito;

public class Generated[MethodUnderTest]

TestSetMultipleExistingPaths {

    @Test
    public void [MethodUnderTest]TestSetMultipleExistingPaths() {
        Map<String, List<String>> comments = Collections.singletonList(Collections.singletonList(new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(Collections.singletonList(Collections.singletonList(new CommentLine())));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment1\ncomment2");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

}