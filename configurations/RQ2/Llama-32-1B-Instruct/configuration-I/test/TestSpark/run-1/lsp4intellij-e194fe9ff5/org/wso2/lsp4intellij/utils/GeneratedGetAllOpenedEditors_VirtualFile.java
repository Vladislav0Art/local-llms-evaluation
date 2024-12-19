package org.wso2.lsp4intellij.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedGetAllOpenedEditors_VirtualFile {

    @Test
    public void getAllOpenedEditors_VirtualFile() {
        VirtualFile virtualFile = new VirtualFile();
        List<Editor> editors = FileUtils.getAllOpenedEditors(virtualFile);
        assertEquals(0, editors.size());
    }

}