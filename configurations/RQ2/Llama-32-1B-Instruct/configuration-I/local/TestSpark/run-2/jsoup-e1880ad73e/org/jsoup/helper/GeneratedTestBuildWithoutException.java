package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class GeneratedTestBuildWithoutException {

    @Test
    public void testBuildWithoutException() throws Exception {
        // Arrange
        int value = 10;

        // Act
        String result = buildValue(value);

        // Assert
        assertNotEquals("", result);
    }

    public String appendValue(int index, int value) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value; i++) {
            if (i == index) {
                sb.append('*');
            } else {
                sb.append(value % 10); // Convert value to string and pad with zero
            }
        }
        return sb.toString();
    }

}