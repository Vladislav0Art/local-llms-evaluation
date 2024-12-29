package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import org.junit.Test;
import org.mockito.Mockito;

public class Generated[MethodUnderTest]

TestSetSingleExistingPath {

    @Test
    public void [MethodUnderTest]TestSetSingleExistingPath() {
        Map<String, List<String>> comments = Collections.singletonList(Collections.singletonList(new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

}