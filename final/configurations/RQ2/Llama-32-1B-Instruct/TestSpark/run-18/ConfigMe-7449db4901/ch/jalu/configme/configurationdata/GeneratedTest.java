package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.comments.CommentsConfigurationComments;
import ch.jalu.configme.settings.SettingsHolder;
import ch.jalu.configme.utils.Assertions;
import org.jetbrains.annotations.NotNull;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTest {

    private static CommentsConfiguration commentsConfiguration;

    @BeforeClass
    public void setup() {
        commentsConfiguration = new CommentsConfigurationBuilder()
                .withComments(new CommentsConfigurationComments("comments"))
                .build();
    }

    @Test
    public void testSetCommentSingleLine() {
        Assertions.assertAllAssertions(
                () -> commentsConfiguration.setComment("path", ""),

                () -> commentsConfiguration.getAllComments().get("path").stream()
                        .allMatch(comment -> comment.isEmpty()));

        Assertions.assertAllAssertions(
                () -> commentsConfiguration.setComment("path", "single-line comment"),

                () -> commentsConfiguration.getAllComments().get("path").stream()
                        .allMatch(comment -> comment.contains("single-line")));
    }

    @Test
    public void testSetCommentMultipleLines() {
        Assertions.assertAllAssertions(
                () -> commentsConfiguration.setComment("path", Arrays.asList("line1", "line2")));

        Assertions.assertAllAssertions(
                () -> commentsConfiguration.getAllComments().get("path").stream()
                        .allMatch(comment -> comment.contains("line1") || comment.contains("line2")));

        Assertions.assertAllAssertions(
                () -> commentsConfiguration.setComment("path", Arrays.asList("single-line comment")));

        Assertions.assertAllAssertions(
                () -> commentsConfiguration.getAllComments().get("path").stream()
                        .allMatch(comment -> comment.contains("single-line comment")));
    }

    @Test
    public void testGetAllComments() {
        Assertions.assertAllAssertions(
                () -> CommentsConfigurationCommentTest.verifyCommentsAreAdded(commentsConfiguration),

                () -> CommentsConfigurationCommentTest.verifyCommentsAreNotRemoved(commentsConfiguration));

        Assertions.assertAllAssertions(
                () -> commentsConfiguration.getAllComments().isEmpty());

        Assertions.assertAllAssertions(
                () -> commentsConfiguration.getAllComments().get("path").stream()
                        .allMatch(comment -> comment.equals(CommentsConfigurationCommentTest.getComment("path", ""))));

        Assertions.assertAllAssertions(
                () -> commentsConfiguration.getAllComments().get("path").stream()
                        .allMatch(comment -> comment.contains("single-line")));
    }

    private static class CommentsConfigurationCommentTest {
        public static String getComment(String path, String line) {
            // implementation
            return "";
        }
    }

}