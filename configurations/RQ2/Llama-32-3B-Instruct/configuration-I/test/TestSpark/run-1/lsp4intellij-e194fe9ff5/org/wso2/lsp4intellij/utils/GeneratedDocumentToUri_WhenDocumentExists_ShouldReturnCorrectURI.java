package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.wso2.lsp4intellij.utils.FileUtils;
import org.wso2.lsp4intellij.utils.ProjectUtil;
import org.wso2.lsp4intellij.utils.VirtualFileUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Set;
import java.util.stream.Collectors;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDocumentToUri_WhenDocumentExists_ShouldReturnCorrectURI {

    private static class Project {
        public String name;
        public List<VirtualFile> files = new ArrayList<>();
    }

    private static class Document {
        public File file;
    }

    @Mock
    private ProjectUtil projectUtil;

    @Test
    public void documentToUri_WhenDocumentExists_ShouldReturnCorrectURI() throws Exception {
        Document document = new Document();
        document.setFile(new File("/path/to/file.txt"));
        String uri = "document:///path/to/file.txt";
        assertEquals(uri, FileUtils.documentToURI(document).getUri());
    }
}

class Editor {
    private String id;
    private String uri;

    public Editor(String id, String uri) {
        this.id = id;
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public String getUri() {
        return uri;
    }
}

class VirtualFile {
    private File file;

    public VirtualFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

}