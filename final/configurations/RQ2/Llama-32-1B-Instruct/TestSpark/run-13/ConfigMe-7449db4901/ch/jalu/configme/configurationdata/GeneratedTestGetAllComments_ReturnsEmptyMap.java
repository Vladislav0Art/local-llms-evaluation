package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class GeneratedTestGetAllComments_ReturnsEmptyMap {

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    public void setup() {
        commentsConfiguration = new CommentsConfigurationBuilder();
        SettingsHolder settingsHolder = new SettingsHolder();
        commentsConfiguration = commentsConfiguration.setComments(settingsHolder.getComments());
    }

    @Test
    public void testGetAllComments_ReturnsEmptyMap() {
        String path = "/path";
        commentsConfiguration.setComment(path, "");
        Map<String, List<String>> expectedComments = new HashMap<>();
        Assert.assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}