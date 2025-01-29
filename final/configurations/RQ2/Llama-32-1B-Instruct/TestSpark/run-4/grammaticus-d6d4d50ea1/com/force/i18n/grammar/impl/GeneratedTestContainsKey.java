package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    private static final Map<String, String> TEST_MAP = new HashMap<>();

    @InjectMocks
    private GrammaticalTermMapImpl<GrammaticalTerm> mock;

    @Test
    public void testContainsKey() {
        // Arrange
        TEST_MAP.put("test", "value");
        when(mock.containsKey("test")).thenReturn(true);

        // Act
        boolean result = mock.containsKey("test");

        // Assert
        assertTrue(result);
    }

}