package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private Comment comment;
    @Mock
    private Document.OutputSettings mockOutputSettings;
    @Mock
    private Element mockElement;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testGetData() {
        // Arrange
        String expectedData = "testData";
        comment.setData(expectedData);

        // Act
        String actualData = comment.getData();

        // Assert
        assertEquals(expectedData, actualData);
    }

    @Test
    public void testNodeName() {
        // Arrange
        String expectedNodeName = "#comment";

        // Act
        String actualNodeName = comment.nodeName();

        // Assert
        assertEquals(expectedNodeName, actualNodeName);
    }

    @Test
    public void testSetData() {
        // Arrange
        String expectedData = "testData";

        // Act
        Comment actualComment = comment.setData(expectedData);

        // Assert
        assertEquals(expectedData, actualComment.getData());
    }

}