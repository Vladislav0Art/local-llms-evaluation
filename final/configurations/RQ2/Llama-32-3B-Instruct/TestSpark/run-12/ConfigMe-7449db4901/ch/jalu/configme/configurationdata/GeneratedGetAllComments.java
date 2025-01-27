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
public class GeneratedGetAllComments {

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments() {
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path1", Arrays.asList("comment1", "comment2"));
        when(commentsConfiguration.settingsHolder).thenReturn(settingsHolder);
        assertEquals(0, ((Object[]) commentsConfiguration.getComment()).length);
    }

}