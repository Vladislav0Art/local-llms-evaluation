package com.adobe.epubcheck.tool;

public class GeneratedTestSetLocale {

    private String path;
    private Map<String, String> env;

    public void setPath(String path) {
        this.path = path;
    }

    public void setEnv(Map<String, String> env) {
        this.env = env;
    }

    public static void main(String[] args) {
        EpubCheck epc = new EpubCheck();
        epc.setPath("path/to/file");
        Map<String, String> env = new HashMap<>();
        env.put(EPUBCHECK_CUSTOM_MESSAGE_FILE, "/tmp/custom_message_file.txt");
        epc.setEnv(env);
    }

    @Test
    public void testSetLocale() {
        EpubCheck epc = new EpubCheck();
        Map<String, String> env = new HashMap<>();
        epc.setEnv(env);
        boolean success = true;
        for (int i = 0; i < 3; i++) {
            epc.showHelp();
            if (!success) {
                break;
            }
        }
    }

}