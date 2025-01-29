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

public class GeneratedTestSetComment_MultipleLines {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetComment_MultipleLines() {
        commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = {"line1", "line2"};
        commentsConfiguration.setComment("path", commentLines);
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get("path"));
    }

}