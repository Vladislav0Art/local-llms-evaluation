package com.force.i18n.grammar.impl;

public class GeneratedTest1 {

    private Set<String> set = new HashSet<>();

    public void addWord(String word) {
        String replacement = replace(word);
        set.add(replacement);
    }

    public List<String> findAndReplacePattern(String s, String[] wordlist) {
        for (String word : wordlist) {
            this.set.add(replace(word));
        }
        return match(s, set);
    }

    private String replace(String str) {
        StringBuilder res = new StringBuilder();
        char ch;
        int i;

        for (i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a' -> res.append("1");
                case 'b' -> res.append("2");
                case 'c' -> res.append("3");
                default:
                    throw new RuntimeException("Bad character");
            }
        }

        return res.toString();
    }

    private List<String> match(String s, Set<String> set) {
        List<String> result = new ArrayList<>();
        for (String word : set) {
            if (match(s, word)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean match(String s, String w) {
        int[] a = new int[3];
        int i = 0;

        while (i < s.length() && i < w.length()) {
            if (a[s.charAt(i) - '1'] == w.charAt(i) - '1') {
                ++i;
            } else {
                return false;
            }
        }

        return i == s.length();
    }
}

public class GeneratedTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        solution.addWord("abCB");
        solution.addWord("azy");
        List<String> result = solution.findAndReplacePattern("abc", new String[]{"abCB", "azy"});
        assertEquals(2, result.size());
    }

}