package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Generated[CommentsConfiguration__setCommentMultiplePaths]

Test {

    @Mock
    private SettingsHolder settingsHolder;

    @Rule
    public MockitoAnnotations rules = MockitoAnnotations.Builder.build();

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void [CommentsConfiguration__setCommentMultiplePaths]Test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "/path1";
        String[] commentLines1 = {"line1", "line2"};
        commentsConfiguration.setComment(path1, commentLines1);

        String path2 = "/path2";
        String[] commentLines2 = {"line3"};
        commentsConfiguration.setComment(path2, commentLines2);

        assertEquals(Collections.singletonMap("/path1", Arrays.asList("line1", "line2")), commentsConfiguration.getAllComments());
    }

}