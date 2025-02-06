package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Generated[CommentsConfiguration__setCommentMultipleLines]

Test {

    @Mock
    private SettingsHolder settingsHolder;

    @Rule
    public MockitoAnnotations rules = MockitoAnnotations.Builder.build();

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void [CommentsConfiguration__setCommentMultipleLines]Test() {
        String path = "/path";
        String[] commentLines = {"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList("line1", "line2"), commentsConfiguration.getAllComments().get(path));
    }

}