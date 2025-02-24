package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setUp() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void setCommentWithNullPathTest() {
        commentsConfiguration.setComment(null, "line1", "line2");
        assertNotNull(commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentWithEmptyPathTest() {
        commentsConfiguration.setComment("", "line1", "line2");
        assertNotNull(commentsConfiguration.getAllComments());
    }

}