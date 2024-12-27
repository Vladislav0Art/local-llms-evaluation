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
public class GeneratedEditorToLSPIdentifier_WhenEditorExists_ShouldReturnCorrectLSPIdentifier {

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
    public void editorToLSPIdentifier_WhenEditorExists_ShouldReturnCorrectLSPIdentifier() throws Exception {
        Editor editor = new Editor("editor1", "file:///path/to/file1");
        assertEquals(editor.getUri(), FileUtils.editorToLSPIdentifier(editor).getUri());
    }

}