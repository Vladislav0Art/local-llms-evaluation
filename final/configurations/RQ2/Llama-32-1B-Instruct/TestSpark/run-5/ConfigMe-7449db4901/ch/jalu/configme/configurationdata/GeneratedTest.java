package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void CommentsConfigurationConstructor_SetsComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), commentsConfig.getAllComments());
    }

    @Test
    public void CommentsConfigurationConstructor_HasDefaultComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> defaultComments = Collections.singletonMap("path", Arrays.asList());
        assertEquals(defaultComments, commentsConfig.getAllComments());
    }

    @Test
    public void setComment_SetsCommentLines() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"", ""};
        commentsConfig.setComment(path, commentLines);
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Arrays.asList(commentLines));
        assertEquals(expectedComments, commentsConfig.getAllComments());
    }

    @Test
    public void setComment_HidesEmptyLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"", ""};
        commentsConfig.setComment(path, commentLines);
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Arrays.asList());
        assertEquals(expectedComments, commentsConfig.getAllComments());
    }

    @Test
    public void setComment_SetsCommentWithEmptyLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"comment"};
        commentsConfig.setComment(path, commentLines);
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Arrays.asList(commentLines));
        assertEquals(expectedComments, commentsConfig.getAllComments());
    }

    @Test
    public void setComment_HidesEmptyLineIfNoComment() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"", ""};
        commentsConfig.setComment(path, commentLines);
        Map<String, List<String>> expectedComments = Collections.singletonMap("path", Arrays.asList());
        assertEquals(expectedComments, commentsConfig.getAllComments());
    }

    @Test
    public void getAllComments_HasDefaultComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> defaultComments = Collections.singletonMap("path", Arrays.asList());
        assertEquals(defaultComments, commentsConfig.getAllComments());
    }

}