package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private static final String PATH = "path";
    private static final String COMMENT_LINE_1 = "comment line 1";
    private static final String COMMENT_LINE_2 = "comment line 2";

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void testConstructor() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.getAllComments());
    }

    @Test
    public void testConstructorWithExistingComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        assertNotNull(commentsConfiguration.getAllComments());
    }

    @Test
    public void testSetComment() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(PATH, COMMENT_LINE_1, COMMENT_LINE_2);
        assertEquals(Arrays.asList(COMMENT_LINE_1, COMMENT_LINE_2), commentsConfiguration.getAllComments().get(PATH));
    }

    @Test
    public void testSetCommentWithEmptyLines() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(PATH, "", "");
        assertEquals(Arrays.asList("", ""), commentsConfiguration.getAllComments().get(PATH));
    }

}