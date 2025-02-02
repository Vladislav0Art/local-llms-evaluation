package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_multipleLines_test {

    public static <T> T mock(T type) {
        return Mockito.mock(type);
    }

    public static void configureMock(T mockObject, String methodName, Object... args) {
        Mockito.when(mockObject.getClass().getMethod(methodName, Object.class)).withArguments(args).thenReturn(null);
    }
}

public class CommentsConfiguration {

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
        return comments.getComments();
    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String comment = "line";

        MockitoHelper.configureMock(comments, "setComment", path, comment);

        System.out.println(MockitoHelper.getAllComments(comments));
    }
}

public class GeneratedTest {

    @Test
    public void setComment_multipleLines_test() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String[] lines = {"line1", "line2"};
        List<String> expected = Arrays.asList(lines);
        comments.setComment("path", lines);
        assertEquals(expected, ((List<String>) comments.getComments().get("path")));
    }

}