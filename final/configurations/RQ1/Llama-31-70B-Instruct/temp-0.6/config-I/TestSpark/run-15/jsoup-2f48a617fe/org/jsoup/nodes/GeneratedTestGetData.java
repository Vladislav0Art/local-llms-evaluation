package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetData {

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

}