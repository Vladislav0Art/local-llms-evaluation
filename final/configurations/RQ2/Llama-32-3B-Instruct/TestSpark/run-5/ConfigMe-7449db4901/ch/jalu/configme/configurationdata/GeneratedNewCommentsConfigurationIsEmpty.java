package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentsConfigurationIsEmpty {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assert commentLinesIsEmpty(commentsConfiguration.getAllComments());
    }

}