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
public class GeneratedWhenCommentsConfigurationIsCreated_withProvidedMap_thenMapWithEntriesIsUsed {

    @Mock
    private SettingsHolder settingsHolderMock;

    public CommentsConfigurationTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenCommentsConfigurationIsCreated_withProvidedMap_thenMapWithEntriesIsUsed() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertEquals(1, commentsConfig.comments.size());
        assertTrue(commentsConfig.comments.containsKey("test"));
        assertTrue(commentsConfig.comments.get("test").contains("comment line 1"));
    }

}