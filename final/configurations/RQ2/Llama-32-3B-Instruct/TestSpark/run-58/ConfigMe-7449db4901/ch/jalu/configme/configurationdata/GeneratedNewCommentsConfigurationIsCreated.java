package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationIsCreated {

    public static final String PATH = "path";
    public static final List<String> COMMENT_LINES = Arrays.asList("line1", "line2");

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void newCommentsConfigurationIsCreated() {
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyMap());
        commentsConfiguration.setComment(PATH, COMMENT_LINES);
        Mockito.verify(commentsConfiguration).setComment(Mockito.anyString(), Mockito.anyList());
    }

}