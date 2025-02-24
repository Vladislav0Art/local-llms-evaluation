package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentWithValidPathAndCommentLinesTest {

    @Test
    public void setCommentWithValidPathAndCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        String path = "testPath";
        String[] commentLines = {"testCommentLine1", "testCommentLine2"};

        commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertNotNull(allComments);
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), allComments.get(path));
    }

}