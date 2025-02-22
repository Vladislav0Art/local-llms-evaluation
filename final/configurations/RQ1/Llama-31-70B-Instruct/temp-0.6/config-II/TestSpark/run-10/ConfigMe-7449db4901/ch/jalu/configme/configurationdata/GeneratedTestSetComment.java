package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestSetComment {

    @Mock
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetComment() {
        MockitoAnnotations.initMocks(this);
        String path = "path";
        String[] commentLines = new String[]{"line1", "line2"};

        commentsConfiguration.setComment(path, commentLines);

        assertNotNull(commentsConfiguration.getAllComments().get(path));
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

}