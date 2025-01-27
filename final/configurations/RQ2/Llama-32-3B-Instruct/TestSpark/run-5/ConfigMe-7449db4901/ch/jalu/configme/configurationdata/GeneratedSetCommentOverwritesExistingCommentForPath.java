package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentOverwritesExistingCommentForPath {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setCommentOverwritesExistingCommentForPath() {
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path1", Collections.singletonList("comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(expectedMap);
        String[] commentLines = {"comment3"};
        commentsConfiguration.setComment("path1", commentLines);
        assertEquals(expectedMap, commentsConfiguration.getAllComments());
    }

}