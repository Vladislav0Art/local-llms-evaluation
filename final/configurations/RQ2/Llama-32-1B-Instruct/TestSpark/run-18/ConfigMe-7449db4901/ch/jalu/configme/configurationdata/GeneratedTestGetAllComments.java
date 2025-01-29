package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.comments.CommentsConfigurationComments;
import ch.jalu.configme.settings.SettingsHolder;
import ch.jalu.configme.utils.Assertions;
import org.jetbrains.annotations.NotNull;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestGetAllComments {

    private static CommentsConfiguration commentsConfiguration;

    @BeforeClass
    public void setup() {
        commentsConfiguration = new CommentsConfigurationBuilder()
                .withComments(new CommentsConfigurationComments("comments"))
                .build();
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