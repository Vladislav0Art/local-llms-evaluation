package ch.jalu.configme.configurationdata;

public class GeneratedConstructor_withExistingMap_test {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String... lines) {
        List<String> commentLines = new ArrayList<>();
        for (String line : lines) {
            if (!line.isEmpty()) {
                commentLines.add(line);
            }
        }
        comments.put(path, commentLines);
    }

    public Map<String, List<String>> getComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class CommentsConfigurationTest {

    @Test
    public void constructor_withExistingMap_test() {
        Map<String, List<String>> existingMap = new HashMap<>();
        existingMap.put("path", Arrays.asList("line1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingMap);
        assertEquals(existingMap, commentsConfiguration.getComments());
    }

}