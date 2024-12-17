package ch.jalu.configme.configurationdata;

public class GeneratedConstructorSetsCommentLines {

    private CommentsConfiguration subject;

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

}