package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testNoArgs() {
        test();
    }

    @Test
    public void testPathArg() {
        test("/path/to/this/file.txt");
    }

    @Test
    public void testCustomMessages() {
        test("/path/to/this/file.txt" + ".custommessage.txt");
    }

    @Test
    public void testListChecks() {
        test("/path/to/this/file.txt" + "/listchecks.txt");
    }

    @Test
    public void testLocale() {
        test("/path/to/this/file.txt" + ".locale=fr_FR");
    }

    @Test
    public void testVersion() {
        try {
            System.setProperty(EpubCheck.class.getName().replace("EpubCheck", "").replace(".class", ".jar"));
            Class.forName(EpubCheck.class.getName().replace("EpubCheck", "").replace(".class", ".jar"));
            EpubCheck instance = new EpubCheck();
            if (args != null && !args.isEmpty()) {
                int code = instance.main(args);
                System.out.println(code);
            } else {
                int code = instance.main();
                System.out.println(code);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void test(String args) {
        EpubCheck.instance.run(args);
    }

    public class GeneratedTest {
        public static void main(String[] args) {
            test(args);
        }
    }

}