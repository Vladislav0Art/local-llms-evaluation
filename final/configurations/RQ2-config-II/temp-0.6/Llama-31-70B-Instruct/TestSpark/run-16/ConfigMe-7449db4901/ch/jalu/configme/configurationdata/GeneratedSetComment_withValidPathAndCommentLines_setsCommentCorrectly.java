package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_withValidPathAndCommentLines_setsCommentCorrectly {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_withValidPathAndCommentLines_setsCommentCorrectly() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String commentLine1 = "commentLine1";
        String commentLine2 = "commentLine2";
        String[] commentLines = {commentLine1, commentLine2};

        commentsConfiguration.setComment(path, commentLines);

        List<String> expectedCommentLines = Arrays.asList(commentLine1, commentLine2);
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put(path, expectedCommentLines);
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}