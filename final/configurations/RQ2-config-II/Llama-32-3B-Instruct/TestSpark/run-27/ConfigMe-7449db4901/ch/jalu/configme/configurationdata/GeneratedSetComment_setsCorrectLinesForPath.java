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
public class GeneratedSetComment_setsCorrectLinesForPath {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_setsCorrectLinesForPath() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("comment1", "comment2"));
        existingComments.put("path2", Collections.singletonList("comment3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        commentsConfiguration.setComment("path1", "newComment1");
        commentsConfiguration.setComment("path1", "newComment2");

        assertEquals(2, existingComments.get("path1").size());
    }

}