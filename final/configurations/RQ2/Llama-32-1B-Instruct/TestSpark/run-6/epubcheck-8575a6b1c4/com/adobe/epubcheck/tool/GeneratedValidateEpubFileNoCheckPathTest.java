package com.adobe.epubcheck.tool;

public class GeneratedValidateEpubFileNoCheckPathTest {

    @Test
    public void validateEpubFileNoCheckPathTest() {
        String[] args = {};
        EpubChecker checker = new EpubChecker();
        // test: "validateEpubFileNoCheckPath"
        checkEpubFile(checker, args);
    }

    private void checkEpubFile(EpubChecker checker, String[] args) {
        String path = "";
        try {
            FileResourceProvider resourceProvider = new DefaultResourceProvider();
            Archive archive = resourceProvider.getArchive(path);
            if (archive != null && archive.isDirectory()) {
                for (File file : archive.listFiles()) {
                    if (file.isFile() && file.getName().endsWith(".epub")) {
                        EpubChecker.EpubCheck check = checker.checkEpubFile(file.getAbsolutePath());
                        if (check == null) {
                            throw new RuntimeException("Epub file is not a valid EPUB file");
                        }
                    }
                }
            } else {
                throw new RuntimeException("Invalid archive path: " + path);
            }
        } catch (Exception e) {
            // test: "reportCode"
            System.out.println(e.getMessage());
        }
    }

}