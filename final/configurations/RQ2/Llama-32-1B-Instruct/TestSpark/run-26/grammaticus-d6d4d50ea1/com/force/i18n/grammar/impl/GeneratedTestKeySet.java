package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testKeySet() {
        // Arrange
        Map<String, T> map = mockRepository.createMap();
        map.put("term1", mockRepository.createObject());
        map.put("term2", mockRepository.createObject());

        // Act
        Set<String> result = GrammaticalTermMapImpl.class.getMethod("keySet").invoke(map);

        // Assert
        assertTrue(result.containsAll(Arrays.asList("term1", "term2")));
    }

}