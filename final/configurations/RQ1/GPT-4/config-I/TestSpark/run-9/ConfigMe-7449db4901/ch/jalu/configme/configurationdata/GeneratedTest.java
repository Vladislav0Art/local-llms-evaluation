package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void setCommentPathAndCommentLinesTest() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "TestPath";
        String[] commentLines = {"Line1", "Line2", "Line3"};

        // when
        commentsConfiguration.setComment(path, commentLines);

        // then
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertArrayEquals(commentLines, allComments.get(path).toArray());
    }

    @Test
    public void setCommentOverrideExistingCommentsTest() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "OverridePath";
        String[] commentLinesOld = {"LineOld1", "LineOld2"};
        String[] commentLinesNew = {"LineNew1", "LineNew2"};

        // when
        commentsConfiguration.setComment(path, commentLinesOld);
        commentsConfiguration.setComment(path, commentLinesNew);

        // then
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertArrayEquals(commentLinesNew, allComments.get(path).toArray());
    }

    @Test
    public void getAllCommentsEmptyTest() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // when
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // then
        assertEquals(0, allComments.size());
    }

}