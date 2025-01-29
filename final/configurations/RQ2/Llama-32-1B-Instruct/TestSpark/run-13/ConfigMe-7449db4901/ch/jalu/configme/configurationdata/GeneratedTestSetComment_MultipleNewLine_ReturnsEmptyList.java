package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class GeneratedTestSetComment_MultipleNewLine_ReturnsEmptyList {

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    public void setup() {
        commentsConfiguration = new CommentsConfigurationBuilder();
        SettingsHolder settingsHolder = new SettingsHolder();
        commentsConfiguration = commentsConfiguration.setComments(settingsHolder.getComments());
    }

    @Test
    public void testSetComment_MultipleNewLine_ReturnsEmptyList() {
        String path = "/path";
        String commentLines = "\nThis is a single new-line comment.\nAnd another one.";
        commentsConfiguration.setComment(path, commentLines);
        List<String> expectedCommentLines = Collections.emptyList();
        Assert.assertEquals(expectedCommentLines, commentsConfiguration.getAllComments().get(path));
    }

}