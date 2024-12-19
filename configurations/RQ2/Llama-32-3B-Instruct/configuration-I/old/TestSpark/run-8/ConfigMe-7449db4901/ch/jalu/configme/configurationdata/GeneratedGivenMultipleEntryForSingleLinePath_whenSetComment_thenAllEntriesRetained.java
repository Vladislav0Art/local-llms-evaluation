package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenMultipleEntryForSingleLinePath_whenSetComment_thenAllEntriesRetained {

    @Mock
    private Map<String, List<String>> commentsMap;

    @InjectMocks
    private CommentsConfiguration configuration;

    @RunWith(MockitoJUnitRunner.class)
    public static void main(String[] args) {
        // Initialize the test runner
    }

    @Test
    public void givenMultipleEntryForSingleLinePath_whenSetComment_thenAllEntriesRetained() {
        String path = "";
        Set<String> commentLines1 = new HashSet<>();
        commentLines1.add("comment");
        Set<String> commentLines2 = new HashSet<>();
        commentLines2.add("new comment");
        Mockito.when(configuration.setComment(path, commentLines1)).thenReturn(null);
        Mockito.when(configuration.setComment(path, commentLines2)).thenReturn(null);
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result.size(), is(2));
    }

}