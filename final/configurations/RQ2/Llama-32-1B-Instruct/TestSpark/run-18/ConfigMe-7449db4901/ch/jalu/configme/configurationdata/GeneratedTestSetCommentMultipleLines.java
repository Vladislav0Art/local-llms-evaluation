package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.comments.CommentsConfigurationComments;
import ch.jalu.configme.settings.SettingsHolder;
import ch.jalu.configme.utils.Assertions;
import org.jetbrains.annotations.NotNull;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestSetCommentMultipleLines {

    private static CommentsConfiguration commentsConfiguration;

    @BeforeClass
    public void setup() {
        commentsConfiguration = new CommentsConfigurationBuilder()
                .withComments(new CommentsConfigurationComments("comments"))
                .build();
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

}