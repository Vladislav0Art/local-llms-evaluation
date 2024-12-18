package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public String wordWrap(String[] words, int maxLength) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            while (word.length() > maxLength) {
                sb.append(word.substring(0, maxLength)).append("...").append(sb);
                sb.setLength(sb.length() - 1);
            }
            if (sb.length() >= maxLength) break;
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }

    public String[] generateRandomWords(int n, int maxLen) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = 'a';
            while (c <= 'z') {
                sb.append(c);
                c++;
            }
            if (sb.length() > maxLen) break;
            String word = sb.toString().toLowerCase();
            sb.setLength(sb.length() - 1);
            sb.append(word);
        }
        return words(words, n);
    }

}