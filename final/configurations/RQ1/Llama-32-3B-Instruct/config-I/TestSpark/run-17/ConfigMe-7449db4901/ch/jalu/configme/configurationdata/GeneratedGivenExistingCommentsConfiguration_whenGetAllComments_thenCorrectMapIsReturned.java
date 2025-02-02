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
public class GeneratedGivenExistingCommentsConfiguration_whenGetAllComments_thenCorrectMapIsReturned {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void givenExistingCommentsConfiguration_whenGetAllComments_thenCorrectMapIsReturned() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(commentsMap, allComments);
    }

}