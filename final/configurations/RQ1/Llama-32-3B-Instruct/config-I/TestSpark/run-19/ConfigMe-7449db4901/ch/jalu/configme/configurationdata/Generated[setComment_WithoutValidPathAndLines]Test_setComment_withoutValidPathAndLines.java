package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockingbird.MockFormat;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class Generated[setComment_WithoutValidPathAndLines]

Test_setComment_withoutValidPathAndLines {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void init () {
        when(settingsHolder.registerComments()).thenReturn(commentsConfiguration);
        MockitoAnnotations.initMocks(this);
    }

    public CommentsConfiguration getCommentsConfiguration () {
        return commentsConfiguration;
    }

    @Test
    public void [setComment_WithoutValidPathAndLines]Test_setComment_withoutValidPathAndLines() throws Exception {
        when(settingsHolder.registerComments()).thenReturn(commentsConfiguration);
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path", Collections.emptyList());
        commentsConfiguration.setComment("path");
        assertEquals(expectedMap, commentsConfiguration.getComments());
    }

}