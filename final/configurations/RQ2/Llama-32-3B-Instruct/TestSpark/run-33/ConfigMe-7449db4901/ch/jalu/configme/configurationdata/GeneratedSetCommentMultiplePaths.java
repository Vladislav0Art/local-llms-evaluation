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
public class GeneratedSetCommentMultiplePaths {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Mock
    private SettingsHolder settingsHolder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void setCommentMultiplePaths() {
        commentsConfiguration.setComment("path1", "line1");
        commentsConfiguration.setComment("path2", "line2");
        assertThat(commentsConfiguration.getAllComments(), is(Collections.singletonMap("path1", Collections.singletonList("line1")), Collections.singletonMap("path2", Collections.singletonList("line2"))));
    }

}