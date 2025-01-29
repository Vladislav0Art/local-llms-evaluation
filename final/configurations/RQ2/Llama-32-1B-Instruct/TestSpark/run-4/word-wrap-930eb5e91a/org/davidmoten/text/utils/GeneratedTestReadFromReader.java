package org.davidmoten.text.utils;

public class GeneratedTestReadFromReader {

    public String readText() throws IOException {
        return null;
    }
}

public class File {
    public boolean exists() throws FileNotFoundException {
        return false;
    }
}

public interface IOException extends Exception {
}

public class Test {

    public static void main(String[] args) {
        WordWrap wordWrap = new WordWrap();

        System.out.println(wordWrap.wrap("Hello, World!", 10));
    }

    public static void testFromReader() throws IOException {
        Reader reader = new Reader();
        System.out.println(reader.readText());
    }

    public static void testFromClasspathUtf8() throws FileNotFoundException, IOException {
        File file = new File("/path/to/test.txt");
        String text = file.readText();
        System.out.println(text);
    }

    public static void testFromClasspath() throws FileNotFoundException, IOException {
        File file = new File("/path/to/test.txt");
        System.out.println(file.exists());
    }

    public static void testFromClasspath() throws FileNotFoundException, IOException {
        File file = new File("/path/to/test.txt");
        System.out.println(file.exists());
    }

    public static void testFromFile() throws FileNotFoundException, IOException {
        File file = new File("test.txt");
        String text = file.readText();
        System.out.println(text);
    }
}

public class Test {

    @Test
    public void testReadFromReader() throws IOException {
        Test.testFromReader();
    }

}