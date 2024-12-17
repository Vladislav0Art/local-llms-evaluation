package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentOverrideExistingComments {

    private CommentsConfiguration subject;

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

}