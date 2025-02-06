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
public class GeneratedShouldCreateComentsConfigurationWithMultiplePaths {

    @Mock
    private Map<String, List<String>> commentsMapMock;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(commentsMapMock);
    }

    @Test
    public void shouldCreateComentsConfigurationWithMultiplePaths() {
        String path1 = "/path/to/resource1";
        String path2 = "/path/to/resource2";
        when(commentsMapMock.get(path1)).thenReturn(Arrays.asList("line11", "line12"));
        when(commentsMapMock.get(path2)).thenReturn(Arrays.asList("line21", "line22"));
        CommentsConfiguration commentsConfig = getCommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfig.getAllComments();
        assertThat(allComments.size(), is(2));
    }

}