package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenCommentsConfigurationgetAllComments_thenReadOnlyViewOfAllEntriesIsReturned {

    @Mock
    private SettingsHolder settingsHolderMock;

    public CommentsConfigurationTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void givenCommentsConfigurationgetAllComments_thenReadOnlyViewOfAllEntriesIsReturned() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("", Arrays.asList(""));
        Mockito.when(settingsHolderMock.registerComments()).thenReturn(expectedMap);
        commentsConfig.setComment("test", "\n");
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}

public class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
    }

    public void setComment(String key, String value) {
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

}