package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldCreateComentsConfigurationWithMultipleCommentLines {

    @Mock
    private Map<String, List<String>> commentsMapMock;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(commentsMapMock);
    }

    @Test
    public void shouldCreateComentsConfigurationWithMultipleCommentLines() {
        String path = "/path/to/resource";
        when(commentsMapMock.get(path)).thenReturn(Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfig = getCommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfig.getAllComments();
        assertThat(allComments.size(), is(1));
    }

}