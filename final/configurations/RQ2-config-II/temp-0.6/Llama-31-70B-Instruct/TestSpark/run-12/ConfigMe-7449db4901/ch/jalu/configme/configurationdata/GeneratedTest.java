package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;
    private String[] commentLines = {"Hello, World!"};

    @Before
    public void setUp() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @After
    public void tearDown() {
        commentsConfiguration = null;
    }

    @Test
    public void setCommentTest() {
        commentsConfiguration.setComment("test", commentLines);
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get("test"));
    }

}