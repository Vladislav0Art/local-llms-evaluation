package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_EmptyMap {

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_EmptyMap() {
        Map<String, List<String>> expectedMap = Collections.emptyMap();
        when(commentsConfiguration.settingsHolder).thenReturn(settingsHolder);
        assertEquals(0, ((Object[]) commentsConfiguration.getComment()).length);
    }

}