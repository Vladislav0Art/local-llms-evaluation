package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Generated[CommentsConfiguration__getAllComments]

Test {

    @Mock
    private SettingsHolder settingsHolder;

    @Rule
    public MockitoAnnotations rules = MockitoAnnotations.Builder.build();

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void [CommentsConfiguration__getAllComments]Test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "/path1";
        String[] commentLines1 = {"line1", "line2"};
        commentsConfiguration.setComment(path1, commentLines1);

        assertEquals(Collections.singletonMap("/path1", Arrays.asList("line1", "line2")), commentsConfiguration.getAllComments());
    }

}