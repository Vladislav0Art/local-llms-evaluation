package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenExistingCommentMap_whenSetComment_thenEntryUpdated {

    @Mock
    private Map<String, List<String>> commentsMap;

    @InjectMocks
    private CommentsConfiguration configuration;

    @RunWith(MockitoJUnitRunner.class)
    public static void main(String[] args) {
        // Initialize the test runner
    }

    @Test
    public void givenExistingCommentMap_whenSetComment_thenEntryUpdated() {
        when(configuration.setComment("path", "comment")).thenReturn(null);
        Map<String, List<String>> result = new CommentsConfiguration().getAllComments();
        assertThat(result.get("path"), hasSize(1));
    }

}