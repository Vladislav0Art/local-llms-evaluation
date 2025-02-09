package ch.jalu.configme.configurationdata;

public class GeneratedTestGetComments {

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < 5;
            }

            @Override
            public String next() {
                return "Mock comment " + index++;
            }
        };
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return new ArrayList<>(fromIndex, toIndex);
    }
}

public class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public CommentsConfiguration(Map<String, List<String>> wrapper) {
        this.comments = wrapper;
    }

    public List<String> getComments(String path) {
        if (!comments.containsKey(path)) {
            return Collections.emptyList();
        }
        return new ArrayList<>(comments.get(path));
    }

    public void addComment(String path, String comment) {
        comments.computeIfAbsent(path, k -> new ArrayList<>()).add(comment);
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }
}

public class GeneratedTest {

    private static CommentLineMock providedCommentLines = new CommentLineMock();
    private static CommentsConfiguration configuration;

    @Before
    public void setUp() throws Exception {
        configuration = new CommentsConfiguration(new HashMap<>());
    }

    @Test
    public void testGetComments() throws Exception {
        Mockito.when(wrapper.getMap()).thenReturn(providedCommentLines);
        List<String> commentLines = configuration.getComments();
        assertEquals(0, commentLines.size());
    }

}