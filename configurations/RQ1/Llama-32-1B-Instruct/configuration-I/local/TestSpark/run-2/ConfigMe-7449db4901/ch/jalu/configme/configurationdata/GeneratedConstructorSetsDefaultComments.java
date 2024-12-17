package ch.jalu.configme.configurationdata;

public class GeneratedConstructorSetsDefaultComments {

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

}