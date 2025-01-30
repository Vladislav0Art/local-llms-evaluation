package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.List;
import java.util.Map;

public class GeneratedSetCommentPathAndCommentLinesTest {

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

}