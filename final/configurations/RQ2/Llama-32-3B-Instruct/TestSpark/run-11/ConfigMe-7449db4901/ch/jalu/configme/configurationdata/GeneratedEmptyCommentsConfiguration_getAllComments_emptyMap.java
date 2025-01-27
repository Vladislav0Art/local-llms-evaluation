package ch.jalu.configme.configurationdata;

public class GeneratedEmptyCommentsConfiguration_getAllComments_emptyMap {

    private Map<String, String> comments = new HashMap<>();

    public void setComment(String path, String comment1, String comment2) {
        if (comment1 != null && !comment1.isEmpty()) {
            comments.put(path, comment1);
        }
        if (comment2 != null && !comment2.isEmpty()) {
            comments.put(path, comments.getOrDefault(path, "").concat("\n" + comment2));
        }
    }

    public Map<String, List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }

    public void setComment(String path, String... comments) {
        for (int i = 0; i < comments.length - 1; i += 2) {
            if (i + 1 >= comments.length || comments[i + 1] == null || comments[i + 1].isEmpty()) {
                continue;
            }
            setComment(path, comments[i], comments[i + 1]);
        }
    }

    public List<String> getComments() {
        return new ArrayList<>(comments.values());
    }
}

public class GeneratedTest {

    @Test
    public void emptyCommentsConfiguration_getAllComments_emptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> result = config.getAllComments();
        assertEquals(0, result.size());
    }

}