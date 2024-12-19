package org.jsoup.nodes;

public class GeneratedTestSetData {

    private Comment comment;

    @Before
    public void setUp() {
        ParseSettings parseSettings = new ParseSettings();
        parseSettings.setPreserveCase(true);
        String data = "# This is a comment";
        comment = new Comment(data);
    }

    @Test
    public void testSetData() {
        // Arrange
        String data = "# This is a comment";
        comment.setData(data);

        // Act
        String actual = comment.getData();

        // Assert
        assertEquals(data, actual);
    }

}