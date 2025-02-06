package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Generated[CommentsConfiguration__setCommentInvalidPath]

Test {

    @Mock
    private SettingsHolder settingsHolder;

    @Rule
    public MockitoAnnotations rules = MockitoAnnotations.Builder.build();

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void [CommentsConfiguration__setCommentInvalidPath]Test() {
        String path = "invalid/path";
        String[] commentLines = {"line1", "line2"};
        try {
            commentsConfiguration.setComment(path, commentLines);
            assert false;
        } catch (Exception e) {
        }
    }

}