package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testIsSkinny() {
        // Arrange
        Map<String, T> map = mockRepository.createMap();
        map.put("term", mockRepository.createObject());

        // Act
        boolean result = GrammaticalTermMapImpl.class.getMethod("isSkinny", Map.class).invoke(map);

        // Assert
        assertTrue(result);
    }

}