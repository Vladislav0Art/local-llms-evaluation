package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedSetCommentSingleLine {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Mock
    private SettingsHolder settingsHolder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void setCommentSingleLine() {
        commentsConfiguration.setComment("path", "line");
        assertThat(commentsConfiguration.getAllComments().get("path"), is(Collections.singletonList("line")));
    }

}