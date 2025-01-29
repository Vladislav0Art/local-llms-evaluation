package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testMakeSkinny() {
        // Arrange
        Map<String, T> map = mockRepository.createMap();
        map.put("term", mockRepository.createObject());

        // Act
        GrammaticalTermMap<T> result = GrammaticalTermMapImpl.class.getMethod("makeSkinny").invoke(map);

        // Assert
        assertNotNull(result);
    }

}