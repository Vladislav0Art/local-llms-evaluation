package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
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
public class GeneratedSetCommentTest {

    @Mock
    private Map<String, List<String>> mockComments;

    @Test
    public void setCommentTest() {
        String path = "testPath";
        String[] commentLines = {"comment1", "comment2"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(mockComments);
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Collections.unmodifiableList(Arrays.asList(commentLines)), mockComments.get(path));
    }

}