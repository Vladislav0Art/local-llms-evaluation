package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void [MethodUnderTest]

    TestGetAllComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList(new CommentLine(), new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

    @Test
    public void [MethodUnderTest]

    TestGetComment() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList(new CommentLine(), new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        CommentsConfiguration.AssertSingleComment(commentsConfiguration.setComment("path", "comment"));
    }

    @Test
    public void [MethodUnderTest]

    TestSetComment() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList(new CommentLine(), new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

    @Test
    public void [MethodUnderTest]

    TestSetMultipleCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList(new CommentLine(), new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment1\ncomment2");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

    @Test
    public void [MethodUnderTest]

    TestSetEmptyCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.singletonList(new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

    @Test
    public void [MethodUnderTest]

    TestSetNoExistingCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(Collections.emptyList());
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment1\ncomment2");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

    @Test
    public void [MethodUnderTest]

    TestSetNoExistingPaths() {
        Map<String, List<String>> comments = Collections.emptyList();
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

    @Test
    public void [MethodUnderTest]

    TestSetSingleExistingPath() {
        Map<String, List<String>> comments = Collections.singletonList(Collections.singletonList(new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(comments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

    @Test
    public void [MethodUnderTest]

    TestSetMultipleExistingPaths() {
        Map<String, List<String>> comments = Collections.singletonList(Collections.singletonList(new CommentLine()));
        Mockito.when(CommentsConfiguration.getAllComments()).thenReturn(Collections.singletonList(Collections.singletonList(new CommentLine())));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment1\ncomment2");
        CommentsConfiguration.AssertAllComments(commentsConfiguration.getAllComments());
    }

}