package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentAddsLinesToPathIfItDoesNotExist {

    private Map<String, List<String>> allComments = new HashMap<>();

    public void setComment(String path, String... lines) {
        if (!allComments.containsKey(path)) {
            allComments.put(path, new ArrayList<>());
        }
        Collections.addAll(allComments.get(path), Arrays.asList(lines));
    }

    public Map<String, List<String>> getAllComments() {
        return allComments;
    }
}

public class GeneratedTest {

    @Test
    public void setCommentAddsLinesToPathIfItDoesNotExist() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "line1", "line2");
        assertEquals(2, config.getAllComments().get("test").size());
    }

}