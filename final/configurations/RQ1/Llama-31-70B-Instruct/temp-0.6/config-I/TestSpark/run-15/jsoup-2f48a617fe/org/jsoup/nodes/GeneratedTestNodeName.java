package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestNodeName {

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
    public void testNodeName() {
        // Arrange
        String expectedNodeName = "#comment";

        // Act
        String actualNodeName = comment.nodeName();

        // Assert
        assertEquals(expectedNodeName, actualNodeName);
    }

}