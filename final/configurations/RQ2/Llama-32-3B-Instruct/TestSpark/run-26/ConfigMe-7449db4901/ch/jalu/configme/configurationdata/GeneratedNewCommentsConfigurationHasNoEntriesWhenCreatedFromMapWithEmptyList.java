package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationHasNoEntriesWhenCreatedFromMapWithEmptyList {

    private Map<String, List<String>> allComments = new HashMap<>();

    public void setComment(String path, String... lines) {
        if (!allComments.containsKey(path)) {
            allComments.put(path, new ArrayList<>());
        }
        Collections.addAll(allComments.get(path), lines);
    }

    public Map<String, List<String>> getAllComments() {
        return allComments;
    }
}

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationHasNoEntriesWhenCreatedFromMapWithEmptyList() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Collections.emptyList());
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertTrue(config.getAllComments().isEmpty());
    }

}