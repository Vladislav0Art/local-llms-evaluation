package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationException;
import ch.jalu.configme.settings.SettingsHolder;
import ch.jalu.configme.exceptions.ConfigurationExceptionBuilder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestGetAllCommentsToNonExistingPath {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testGetAllCommentsToNonExistingPath() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        try {
            commentsConfiguration.getAllComments().get(path);
            fail("Expected ConfigurationException");
        } catch (CommentsConfigurationException e) {
            // Expected
        }
    }

}