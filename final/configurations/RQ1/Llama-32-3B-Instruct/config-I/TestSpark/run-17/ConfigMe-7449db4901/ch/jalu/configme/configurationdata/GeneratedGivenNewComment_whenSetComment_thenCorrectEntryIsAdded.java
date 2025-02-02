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
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenNewComment_whenSetComment_thenCorrectEntryIsAdded {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void givenNewComment_whenSetComment_thenCorrectEntryIsAdded() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path1";
        when(settingsHolder.registerComments(Mockito.anyString(), Mockito.anyString())).thenReturn(path);
        commentsConfiguration.setComment(path, "line1");
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.get(path).size());
    }

}