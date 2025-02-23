package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsTest {

    @Mock
    private Map<String, List<String>> comments;

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("test", Collections.singletonList("testComment"));
        commentsConfiguration.setComment("test", "testComment");
        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(1, result.size());
        assertTrue(result.containsKey("test"));
        assertEquals(Collections.singletonList("testComment"), result.get("test"));
    }

}