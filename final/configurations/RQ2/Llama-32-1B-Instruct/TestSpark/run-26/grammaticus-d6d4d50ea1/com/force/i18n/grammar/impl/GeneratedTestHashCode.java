package com.force.i18n.grammar.impl;

public class GeneratedTestHashCode {

    private static MockRepository mockRepository;

    @Before
    public void setUp() {
        mockRepository = new MockRepository();
    }

    @Test
    public void testHashCode() {
        // Arrange
        Object obj1 = mockRepository.createObject();
        Object obj2 = mockRepository.createObject();

        // Act
        int hashCode1 = GrammaticalTermMapImpl.class.getMethod("hashCode", Object.class).invoke(obj1);
        int hashCode2 = GrammaticalTermMapImpl.class.getMethod("hashCode", Object.class).invoke(obj2);

        // Assert
        assertTrue(hashCode1 == hashCode2);
    }

}