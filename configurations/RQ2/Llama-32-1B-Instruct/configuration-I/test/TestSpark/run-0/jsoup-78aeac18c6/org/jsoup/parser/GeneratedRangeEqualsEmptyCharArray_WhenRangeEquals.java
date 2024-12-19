package org.jsoup.parser;

public class GeneratedRangeEqualsEmptyCharArray_WhenRangeEquals {

    @Test
    public void rangeEqualsEmptyCharArray_WhenRangeEquals() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        int[] arr1 = {1, 2, 3};
        char[] chars1 = {'a', 'b'};
        int[] arr2 = new int[0];
        char[] chars2 = new char[0];

        assertTrue(reader.rangeEquals(arr1, chars1) && reader.rangeEquals(arr2, chars2));

        assertTrue(reader.rangeEquals(arr1, chars1));
    }

}