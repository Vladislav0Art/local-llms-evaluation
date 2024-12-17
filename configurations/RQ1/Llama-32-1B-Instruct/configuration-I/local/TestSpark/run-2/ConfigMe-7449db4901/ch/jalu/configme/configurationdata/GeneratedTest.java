package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration subject;

    @Test
    public void constructorSetsDefaultComments() {
        // Arrange
        Map<String, List<String>> defaultComments = new HashMap<>();
        defaultComments.put("path1", Collections.emptyList());
        defaultComments.put("path2", Collections.singletonList("line1"));
        defaultComments.put("path3", Collections.singletonList("line2"));

        subject = new CommentsConfiguration(defaultComments);

        // Act
        subject.setComment("path1", "comment1");

        // Assert
        verifyAllSubjects(subject);
    }

    @Test
    public void constructorSetsCommentLines() {
        // Arrange
        Map<String, List<String>> defaultComments = new HashMap<>();
        defaultComments.put("path1", Collections.singletonList("line1"));
        defaultComments.put("path2", Collections.emptyList());
        defaultComments.put("path3", Collections.singletonList("line2"));

        subject = new CommentsConfiguration(defaultComments);

        // Act
        String[] commentLines = {"line1", "comment2"};
        subject.setComment("path1", commentLines);

        // Assert
        verifyAllSubjects(subject);
    }

    @Test
    public void setCommentOverrideExistingComments() {
        // Arrange
        Map<String, List<String>> defaultComments = new HashMap<>();
        defaultComments.put("path1", Collections.singletonList("line1"));
        defaultComments.put("path2", Collections.emptyList());

        subject = new CommentsConfiguration(defaultComments);

        String[] commentLines = {"line1"};
        subject.setComment("path1", commentLines);

        // Act
        subject.setComment("path1", "overrideLine1");

        // Assert
        verifyAllSubjects(subject);
    }

    @Test
    public void getAllCommentsReturnsDefaultComments() {
        // Arrange
        Map<String, List<String>> defaultComments = new HashMap<>();
        defaultComments.put("path1", Collections.emptyList());
        defaultComments.put("path2", Collections.singletonList("line1"));
        defaultComments.put("path3", Collections.emptyList());

        subject = new CommentsConfiguration(defaultComments);

        // Act
        Map<String, @UnmodifiableView List<String>> actualComments = subject.getAllComments();

        // Assert
        verifyAllSubjects(subject);
    }

    private void verifyAllSubjects(CommentsConfiguration subject) {
        for (Map.Entry<String, @NotNull List<String>> entry : subject.comments.entrySet()) {
            String path = entry.getKey();
            @Nullable List<String> commentLines = entry.getValue().get(0);

            if (!commentLines.equals(Collections.emptyList())) {
                assertEquals(commentLines.toString(), Collections.singletonList(path));
            }
        }
    }

}