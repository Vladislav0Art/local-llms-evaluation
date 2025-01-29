package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.comments.CommentsConfigurationComments;
import ch.jalu.configme.settings.SettingsHolder;
import ch.jalu.configme.utils.Assertions;
import org.jetbrains.annotations.NotNull;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestSetCommentSingleLine {

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

}