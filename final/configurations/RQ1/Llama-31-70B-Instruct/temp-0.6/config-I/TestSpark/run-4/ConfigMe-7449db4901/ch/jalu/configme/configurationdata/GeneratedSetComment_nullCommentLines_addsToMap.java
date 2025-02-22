package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_nullCommentLines_addsToMap {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setUp() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void setComment_nullCommentLines_addsToMap() {
        String path = "samplePath";
        String[] commentLines = null;
        commentsConfiguration.setComment(path, commentLines);

        assertTrue(commentsConfiguration.getAllComments().containsKey(path));
        assertEquals(null, commentsConfiguration.getAllComments().get(path));
    }

}