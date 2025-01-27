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
public class GeneratedSetMultipleCommentLinesForPathWithEmptyLine {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setMultipleCommentLinesForPathWithEmptyLine() {
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("path1", Arrays.asList("", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(expectedMap);
        String[] commentLines = {"comment3"};
        commentsConfiguration.setComment("path1", Arrays.asList(commentLines[0], "")); // using add instead of single assignment
        assertEquals(new HashMap<>(expectedMap), commentsConfiguration.getAllComments());
    }

    private void assert

    commentLinesIsEmpty(Map<String, @UnmodifiableView List<String>> expectedMap) {
        for (Map.Entry<String, List<String>> entry : expectedMap.entrySet()) {
            assertTrue(entry.getValue().isEmpty());
        }
    }

}