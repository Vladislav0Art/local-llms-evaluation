package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_returnsUnmodifiableMap {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1", "comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertTrue(commentsConfiguration.getAllComments().containsKey("path1"));
    }

}