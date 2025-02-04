package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentsConfiguration_withInitialMap_hasExpectedMap {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentsConfiguration_withInitialMap_hasExpectedMap() {
        // given
        Map<String, List<String>> initialMap = Mockito.mock(Map.class);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialMap);

        when(initialMap.size()).thenReturn(1);
        when(initialMap.keySet()).thenReturn(Arrays.asList("key"));

        // when
        Map<String, List<String>> actualComments = commentsConfiguration.comments;

        // then
        assertNotNull(actualComments);
        assertEquals(1, actualComments.size());
        assertTrue(actualComments.containsKey("key"));
    }

}