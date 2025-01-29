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

public class GeneratedTestGetAllComments_MultiplePaths {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testGetAllComments_MultiplePaths() {
        commentsConfiguration = new CommentsConfiguration();
        String[] commentLines1 = {"line1", "line2"};
        String[] commentLines2 = {"line3", "line4"};
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        Mockito.when(settingsHolder.getComments("path1")).thenReturn(Arrays.asList(commentLines1));
        Mockito.when(settingsHolder.getComments("path2")).thenReturn(Arrays.asList(commentLines2));
        assertEquals(Arrays.asList(Arrays.asList("line1", "line2"), Arrays.asList("line3", "line4")), commentsConfiguration.getAllComments().get("path"));
    }

}