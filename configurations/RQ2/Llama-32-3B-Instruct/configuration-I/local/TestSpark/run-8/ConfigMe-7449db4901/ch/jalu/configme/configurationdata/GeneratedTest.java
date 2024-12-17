package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Map<String, List<String>> commentsMap;

    @InjectMocks
    private CommentsConfiguration configuration;

    @RunWith(MockitoJUnitRunner.class)
    public static void main(String[] args) {
        // Initialize the test runner
    }

    @Test
    public void givenNoInitialCommentMap_whenGetAllComments_thenEmptyMap() {
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result, emptyCollectionOf(List.class));
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

    @Test
    public void givenExistingCommentMap_whenSetComment_thenEntryUpdated() {
        when(configuration.setComment("path", "comment")).thenReturn(null);
        Map<String, List<String>> result = new CommentsConfiguration().getAllComments();
        assertThat(result.get("path"), hasSize(1));
    }

    @Test
    public void givenNewEntryForSingleLinePath_whenSetComment_thenEntryAdded() {
        String path = "";
        Set<String> commentLines = new HashSet<>();
        commentLines.add("comment");
        Mockito.when(configuration.setComment(path, commentLines)).thenReturn(null);
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result.size(), is(1));
    }

    @Test
    public void givenTwoNewEntriesForSingleLinePath_whenSetComment_thenMultipleEntryAdded() {
        String path = "";
        Set<String> commentLines1 = new HashSet<>();
        commentLines1.add("comment1");
        Set<String> commentLines2 = new HashSet<>();
        commentLines2.add("comment2");
        Mockito.when(configuration.setComment(path, commentLines1)).thenReturn(null);
        Mockito.when(configuration.setComment(path, commentLines2)).thenReturn(null);
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result.size(), is(2));
    }

    @Test
    public void givenExistingEntryForSingleLinePath_whenSetComment_thenSameEntryRetained() {
        String path = "";
        Set<String> commentLines1 = new HashSet<>();
        commentLines1.add("comment");
        Mockito.when(configuration.setComment(path, commentLines1)).thenReturn(null);
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result.size(), is(0));
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