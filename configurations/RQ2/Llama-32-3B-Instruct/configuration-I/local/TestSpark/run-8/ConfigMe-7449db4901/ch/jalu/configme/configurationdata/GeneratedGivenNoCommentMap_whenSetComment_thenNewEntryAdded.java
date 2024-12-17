package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenNoCommentMap_whenSetComment_thenNewEntryAdded {

    @Mock
    private Map<String, List<String>> commentsMap;

    @InjectMocks
    private CommentsConfiguration configuration;

    @RunWith(MockitoJUnitRunner.class)
    public static void main(String[] args) {
        // Initialize the test runner
    }

    @Test
    public void givenNoCommentMap_whenSetComment_thenNewEntryAdded() {
        String path = "path";
        Set<String> commentLines = new HashSet<>();
        commentLines.add("comment");
        Mockito.when(configuration.setComment(path, commentLines)).thenReturn(null);
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result.size(), is(1));
    }

}