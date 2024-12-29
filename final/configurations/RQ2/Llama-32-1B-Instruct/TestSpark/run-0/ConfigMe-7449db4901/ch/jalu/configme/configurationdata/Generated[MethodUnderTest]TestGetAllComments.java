package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import org.junit.Test;
import org.mockito.Mockito;

public class Generated[MethodUnderTest]

TestGetAllComments {

    @Test
    public void [MethodUnderTest]TestGetAllComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList(new CommentLine(), new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

}