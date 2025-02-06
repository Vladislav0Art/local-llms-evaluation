package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Generated[CommentsConfiguration__setCommentSingleNewline]

Test {

    @Mock
    private SettingsHolder settingsHolder;

    @Rule
    public MockitoAnnotations rules = MockitoAnnotations.Builder.build();

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void [CommentsConfiguration__setCommentSingleNewline]Test() {
        String path = "/path";
        String[] commentLines = {"\n"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Collections.singletonList("\n"), commentsConfiguration.getAllComments().get(path));
    }

}