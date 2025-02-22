package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetData {

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
    public void testSetData() {
        // Arrange
        String expectedData = "testData";

        // Act
        Comment actualComment = comment.setData(expectedData);

        // Assert
        assertEquals(expectedData, actualComment.getData());
    }

}