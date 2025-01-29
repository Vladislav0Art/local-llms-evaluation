package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    public String joinPaths(String... paths) {
        return java.util.Arrays.stream(paths).map(path -> path.isEmpty() ? null : path).collect(Collectors.joining(" "));
    }

}