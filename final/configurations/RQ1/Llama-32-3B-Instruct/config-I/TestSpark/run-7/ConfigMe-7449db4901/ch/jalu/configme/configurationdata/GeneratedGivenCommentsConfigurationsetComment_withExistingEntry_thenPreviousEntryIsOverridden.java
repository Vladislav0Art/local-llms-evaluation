package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenCommentsConfigurationsetComment_withExistingEntry_thenPreviousEntryIsOverridden {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Test
    public void givenCommentsConfigurationsetComment_withExistingEntry_thenPreviousEntryIsOverridden() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("", Arrays.asList("comment line 1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("", Arrays.asList(""));
        Mockito.when(settingsHolderMock.registerComments()).thenReturn(expectedMap);
        commentsConfig.setComment("test", "new comment line");
    }

}