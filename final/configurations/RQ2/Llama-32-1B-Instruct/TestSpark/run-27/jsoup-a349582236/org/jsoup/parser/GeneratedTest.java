package org.jsoup.parser;

public class GeneratedTest {

    private final String normalName;

    public ParseSettingsImpl(String normalName) {
        this.normalName = normalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParseSettingsImpl that = (ParseSettingsImpl) o;
        return Objects.equals(normalName, that.normalName);
    }
}

public class HashCodeTest {
    public static void main(String[] args) {
        String test1 = "test1";
        String test2 = "test1";

        System.out.println(test1.hashCode() == test2.hashCode());

        String test3 = new String("test3");
        System.out.println(test1.hashCode() == test3.hashCode());
    }
}

public class HashCodeTest2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        System.out.println(i.equals(j));
    }
}

public class TestParseSettingsImpl {

}