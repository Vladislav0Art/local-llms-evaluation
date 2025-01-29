package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testGet() {
        // Arrange
        Map<String, T> map = mockRepository.createMap();
        map.put("term", mockRepository.createObject());

        // Act
        GrammaticalTerm result = GrammaticalTermMapImpl.class.getMethod("get", String.class).invoke(map, "term");

        // Assert
        assertNotNull(result);
    }

}