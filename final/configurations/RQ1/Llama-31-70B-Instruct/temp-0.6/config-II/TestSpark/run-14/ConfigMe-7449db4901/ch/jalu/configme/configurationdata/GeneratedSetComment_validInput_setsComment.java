package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_validInput_setsComment {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setUp() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void setComment_validInput_setsComment() {
        String path = "test-path";
        String[] commentLines = {"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);

        assertEquals(commentLines, commentsConfiguration.getAllComments().get(path).toArray());
    }

}