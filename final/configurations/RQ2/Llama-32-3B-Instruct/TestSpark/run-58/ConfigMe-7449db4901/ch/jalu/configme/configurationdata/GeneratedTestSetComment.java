package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestSetComment {

    public static final String PATH = "path";
    public static final List<String> COMMENT_LINES = Arrays.asList("line1", "line2");

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetComment() {
        commentsConfiguration.setComment(PATH, "newLine1");
        Mockito.verify(settingsHolder).setComments(Mockito.anyMap());
    }

}