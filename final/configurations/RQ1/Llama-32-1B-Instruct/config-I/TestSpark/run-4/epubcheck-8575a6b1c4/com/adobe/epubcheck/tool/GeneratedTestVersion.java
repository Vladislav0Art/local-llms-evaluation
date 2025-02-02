package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestVersion {

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