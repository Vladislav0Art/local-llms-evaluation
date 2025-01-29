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

public class GeneratedTestSetComment_SingleLine_MultiplePaths {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetComment_SingleLine_MultiplePaths() {
        commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String path2 = "path2";
        commentsConfiguration.setComment(path1, "");
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        commentsConfiguration.setComment(path2, commentLines);
        Mockito.when(settingsHolder.getComments()).thenReturn(Arrays.asList(commentLines));
        assertEquals(Collections.singletonList(Arrays.asList("line1", "line2")), commentsConfiguration.getAllComments().get(path1));
    }

}