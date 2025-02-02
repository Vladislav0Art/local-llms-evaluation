package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String comment) {
        if (!comments.containsKey(path)) {
            comments.put(path, new ArrayList<>());
        }
        comments.get(path).add(comment);
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public static Map<String, List<String>> getAllComments(CommentsConfiguration comments) {
        Map<String, List<String>> allComments = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : comments.getComments().entrySet()) {
            allComments.put(entry.getKey(), comments.getComments().get(entry.getKey()));
        }
        return allComments;
    }
}

public class GeneratedTest {
    public void configureMock(CommentsConfiguration config, String methodName, Object... args) {
    }

    @Before
    public void setup() {
        CommentsConfiguration mockConfig = new CommentsConfiguration();
        Mockito.when(mockConfig.getClass().getMethod("setComment", String.class, String.class)).withArguments(Mockito.anyString(), Mockito.anyString()).thenReturn(null);
    }

    @Test
    public void getAllComments_test() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("line1", "line2"));
        assertEquals(expected, comments.getAllComments());
    }

    @Test
    public void setComment_invalidPath_test() {
        CommentsConfiguration comments = new CommentsConfiguration();
        try {
            comments.setComment("", "line");
            assert false;
        } catch (Exception e) {
        }
    }

}