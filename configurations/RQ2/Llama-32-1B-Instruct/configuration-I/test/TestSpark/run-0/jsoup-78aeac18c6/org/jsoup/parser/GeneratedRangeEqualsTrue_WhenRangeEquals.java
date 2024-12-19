package org.jsoup.parser;

public class GeneratedRangeEqualsTrue_WhenRangeEquals {

    @Test
    public void rangeEqualsTrue_WhenRangeEquals() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        int[] arr1 = {1, 2, 3};
        char[] chars1 = {'a', 'b'};
        int[] arr2 = {4, 5, 6};
        char[] chars2 = {'c', 'd'};

        assertTrue(reader.rangeEquals(arr1, chars1) && reader.rangeEquals(arr2, chars2));

        assertTrue(reader.rangeEquals(arr1, chars1));
    }

}