package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    public void setup() {
        commentsConfiguration = new CommentsConfigurationBuilder();
        SettingsHolder settingsHolder = new SettingsHolder();
        commentsConfiguration = commentsConfiguration.setComments(settingsHolder.getComments());
    }

    @Test
    public void testSetComment_SingleNewLine_ReturnsEmptyList() {
        String path = "/path";
        String commentLines = "This is a single new-line comment.";
        commentsConfiguration.setComment(path, commentLines);
        List<String> expectedCommentLines = Collections.emptyList();
        Assert.assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testSetComment_SingleNewLine_WithNoExistingComment_ReturnsEmptyList() {
        String path = "/path";
        String commentLines = "This is a single new-line comment.";
        commentsConfiguration.setComment(path, commentLines);
        List<String> expectedCommentLines = Collections.emptyList();
        Assert.assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testSetComment_SingleNewLine_WithExistingComment_ReturnsEmptyList() {
        String path = "/path";
        String existingCommentLines = "This is a single new-line comment.";
        commentsConfiguration.setComment(path, existingCommentLines);
        List<String> expectedCommentLines = Collections.emptyList();
        Assert.assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testSetComment_MultipleNewLine_ReturnsEmptyList() {
        String path = "/path";
        String commentLines = "\nThis is a single new-line comment.\nAnd another one.";
        commentsConfiguration.setComment(path, commentLines);
        List<String> expectedCommentLines = Collections.emptyList();
        Assert.assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testSetComment_MultipleNewLine_WithNoExistingComment_ReturnsEmptyList() {
        String path = "/path";
        String commentLines = "\nThis is a single new-line comment.\nAnd another one.";
        commentsConfiguration.setComment(path, commentLines);
        List<String> expectedCommentLines = Collections.emptyList();
        Assert.assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testSetComment_MultipleNewLine_WithExistingComment_ReturnsEmptyList() {
        String path = "/path";
        String existingCommentLines = "This is a single new-line comment.";
        commentsConfiguration.setComment(path, existingCommentLines);
        List<String> expectedCommentLines = Collections.emptyList();
        Assert.assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testGetAllComments_ReturnsEmptyMap() {
        String path = "/path";
        commentsConfiguration.setComment(path, "");
        Map<String, List<String>> expectedComments = new HashMap<>();
        Assert.assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}