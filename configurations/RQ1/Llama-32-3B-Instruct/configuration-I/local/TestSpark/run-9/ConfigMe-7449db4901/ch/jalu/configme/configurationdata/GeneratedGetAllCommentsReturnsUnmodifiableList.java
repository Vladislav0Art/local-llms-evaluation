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
public class GeneratedGetAllCommentsReturnsUnmodifiableList {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void getAllCommentsReturnsUnmodifiableList() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("comment1"));
        commentsConfiguration.setComment(settingsHolder, "path", "comment2");
        assertEquals(commentsConfiguration.getAllComments().get("path"), Collections.unmodifiableList(Arrays.asList("comment1")));
    }

}