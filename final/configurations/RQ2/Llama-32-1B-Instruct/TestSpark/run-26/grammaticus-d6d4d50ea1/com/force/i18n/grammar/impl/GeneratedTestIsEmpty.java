package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmpty {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testIsEmpty() {
        // Arrange
        Map<String, T> map = mockRepository.createMap();

        // Act
        GrammaticalTerm result = GrammaticalTermMapImpl.class.getMethod("isEmpty").invoke(map);

        // Assert
        assertTrue(result);
    }

}