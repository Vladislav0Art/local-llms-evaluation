package org.jsoup.parser;

public class GeneratedRangeEqualsNull_WhenRangeEqualsNull {

    @Test
    public void rangeEqualsNull_WhenRangeEqualsNull() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        int[] arr1 = {1, 2, 3};
        char[] chars1 = {'a', 'b'};
        int[] arr2 = null;
        char[] chars2 = null;

        assertTrue(reader.rangeEquals(arr1, chars1) && reader.rangeEquals(arr2, chars2));

        assertTrue(reader.rangeEquals(arr1, chars1));
    }

}