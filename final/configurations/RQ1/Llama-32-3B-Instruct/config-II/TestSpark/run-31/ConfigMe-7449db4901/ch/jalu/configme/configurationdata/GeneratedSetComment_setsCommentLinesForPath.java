package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetComment_setsCommentLinesForPath {

    @Test
    public void setComment_setsCommentLinesForPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"comment1", "comment2"};
        config.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), config.comments.get(path));
    }

}