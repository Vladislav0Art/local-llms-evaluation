package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    private static final Map<String, String> TEST_MAP = new HashMap<>();

    @InjectMocks
    private GrammaticalTermMapImpl<GrammaticalTerm> mock;

    @Test
    public void testGet() {
        // Arrange
        when(mock.get("test")).thenReturn(new GrammaticalTerm("test"));

        // Act
        String result = mock.get("test");

        // Assert
        assertEquals("test", result);
    }

}