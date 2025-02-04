package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetComment_setsCommentsToUnmodifiableList {

    @Test
    public void setComment_setsCommentsToUnmodifiableList() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"comment1", "comment2"};
        config.setComment(path, commentLines);
        List<String> list = config.comments.get(path);
        assertTrue(list instanceof java.util.List.UnmodifiableList);
    }

}