package org.davidmoten.text.utils;

public class GeneratedTest {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "test.txt";
        InputStream inputStream = new FileInputStream(new File(inputFilePath));

        @Test
        public void testInputStream () throws IOException {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));

                if (new String(buffer, 0, bytesRead).contains("hello")) {
                    break;
                }
            }
        }

        WordWrap.wordWrap(inputStream, System.out, 10, 100);
    }
}

public class InputStreamExample extends InputStream {
    @Override
    public int read() throws IOException {
        return super.read();
    }
}

public class WordWrapExample {
    public static void wordWrap(InputStream inputStream, OutputStream outputStream, int lineLength, int wrapAt) throws IOException {

        char[] buffer = new char[1024];
        int bytesRead;

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            String inputString = new String(buffer, 0, bytesRead);

            if (inputString.length() > lineLength) {
                for (int i = 0; i < inputString.length(); i += lineLength) {
                    String substr = inputString.substring(i, Math.min(i + lineLength, inputString.length()));

                    outputStream.write(substr.getBytes());

                    if (i + lineLength == inputString.length()) {
                        break;
                    }

                    if (inputString.charAt(i + lineLength - 1) == '\n') {
                        outputStream.write('\n');
                    } else if (i + lineLength <= wrapAt && i > 0) {
                        outputStream.write('\n');
                    }
                }
            } else {
                outputStream.write(inputString.getBytes());

                while (inputString.length() < lineLength) {
                    inputString += " ";

                    outputStream.write(inputString.toCharArray());
                }
            }
        }

        if (inputStream.available() > 0) {
            int lastChar = inputStream.read();

            outputStream.write(lastChar);
        }
    }

    @Override
    public void flush() throws IOException {
    }

}