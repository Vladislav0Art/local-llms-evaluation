package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenCommentMapWithMultipleEntries_whenSetComment_thenAllEntriesRetained {

    @Mock
    private Map<String, List<String>> commentsMap;

    @InjectMocks
    private CommentsConfiguration configuration;

    @RunWith(MockitoJUnitRunner.class)
    public static void main(String[] args) {
        // Initialize the test runner
    }

    @Test
    public void givenCommentMapWithMultipleEntries_whenSetComment_thenAllEntriesRetained() {
        Set<String> path1 = new HashSet<>();
        path1.add("path1");
        Set<String> commentLines1 = new HashSet<>();
        commentLines1.add("comment1");
        Mockito.when(configuration.setComment(path1.toString(), commentLines1)).thenReturn(null);
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result.size(), is(2));
    }

}