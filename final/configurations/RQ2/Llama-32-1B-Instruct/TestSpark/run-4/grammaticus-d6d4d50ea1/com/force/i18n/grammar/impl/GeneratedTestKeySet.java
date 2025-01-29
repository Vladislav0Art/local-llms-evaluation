package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    private static final Map<String, String> TEST_MAP = new HashMap<>();

    @InjectMocks
    private GrammaticalTermMapImpl<GrammaticalTerm> mock;

    @Test
    public void testKeySet() {
        // Arrange
        when(mock.keySet()).thenReturn(java.util.Collections.emptySet());

        // Act
        Set<String> result = mock.keySet();

        // Assert
        assertEquals(0, result.size());
    }

}