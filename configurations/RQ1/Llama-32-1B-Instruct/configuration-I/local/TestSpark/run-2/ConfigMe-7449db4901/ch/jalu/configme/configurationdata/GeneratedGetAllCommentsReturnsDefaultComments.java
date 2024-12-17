package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsReturnsDefaultComments {

    private CommentsConfiguration subject;

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