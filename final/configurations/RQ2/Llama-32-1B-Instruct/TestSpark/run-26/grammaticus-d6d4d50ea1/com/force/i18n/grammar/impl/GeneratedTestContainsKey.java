package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testContainsKey() {
        // Arrange
        Map<String, T> map = mockRepository.createMap();
        map.put("term1", mockRepository.createObject());

        // Act
        GrammaticalTerm result = GrammaticalTermMapImpl.class.getMethod("containsKey", String.class).invoke(map, "term1");

        // Assert
        assertTrue(result);
    }

}