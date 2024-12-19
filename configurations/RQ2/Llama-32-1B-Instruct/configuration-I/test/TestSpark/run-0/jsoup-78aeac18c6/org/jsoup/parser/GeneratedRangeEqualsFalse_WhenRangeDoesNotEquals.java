package org.jsoup.parser;

public class GeneratedRangeEqualsFalse_WhenRangeDoesNotEquals {

    @Test
    public void rangeEqualsFalse_WhenRangeDoesNotEquals() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        int[] arr1 = {1, 2, 3};
        char[] chars1 = {'a', 'b'};
        int[] arr2 = {4, 5, 6};
        char[] chars2 = {'c', 'd'};

        assertFalse(reader.rangeEquals(arr1, chars1) && reader.rangeEquals(arr2, chars2));

        assertFalse(reader.rangeEquals(arr1, chars1));
    }

}