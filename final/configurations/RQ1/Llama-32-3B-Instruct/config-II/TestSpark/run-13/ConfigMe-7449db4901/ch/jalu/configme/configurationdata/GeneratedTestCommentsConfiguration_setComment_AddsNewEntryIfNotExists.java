package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCommentsConfiguration_setComment_AddsNewEntryIfNotExists {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void testCommentsConfiguration_setComment_AddsNewEntryIfNotExists() {
        when(commentsMap.containsKey("newPath")).thenReturn(false);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("newPath", "line1");
        assertTrue(commentsConfiguration.comments.containsKey("newPath"));
    }

}