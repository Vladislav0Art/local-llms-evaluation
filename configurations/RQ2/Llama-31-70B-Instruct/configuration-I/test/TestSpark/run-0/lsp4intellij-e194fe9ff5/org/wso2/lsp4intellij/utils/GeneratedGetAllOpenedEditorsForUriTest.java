package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllOpenedEditorsForUriTest {

    private Project project;
    private PsiFile psiFile;
    private VirtualFile file;
    private Editor editor;
    private Document document;

    @Test
    public void getAllOpenedEditorsForUriTest() {
        List<Editor> editors = FileUtils.getAllOpenedEditorsForUri(project, "uri");
        assertNotNull(editors);
    }

}