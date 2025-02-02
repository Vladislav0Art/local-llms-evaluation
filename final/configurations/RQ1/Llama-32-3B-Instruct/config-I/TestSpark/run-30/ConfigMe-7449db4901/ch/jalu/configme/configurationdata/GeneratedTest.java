package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private final @NotNull Map<String, List<String>> comments;

    public static final @NotNull Comparator<CommentsConfiguration> COMPARATOR = new Comparator<CommentsConfiguration>() {
        @Override
        public int compare(CommentsConfiguration obj1, CommentsConfiguration obj2) {
            return Integer.compare(obj1.comments.size(), obj2.comments.size());
        }
    };

    private final @NotNull Map<String, List<String>> comments;

    public static CommentsConfiguration of(@NotNull Map<String, List<String>> map) {
        return new CommentsConfiguration(map);
    }

    public CommentsConfiguration() {
        this(new HashMap<>());
    }

    @NotNull
    public Map<String, @UnmodifiableView List<String>> getComments() {
        return Collections.unmodifiableMap(comments);
    }

    public void setComment(String path, String... commentLines) {
        comments.put(path, Arrays.asList(commentLines));
    }

    @NotNull
    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class GeneratedTest {

}