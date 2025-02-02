package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsXmlDeclaration_throwsNullPointerException_onNullData {

    @Test
    public void isXmlDeclaration_throwsNullPointerException_onNullData() {
        Comment comment = new Comment(null);
        comment.isXmlDeclaration();
    }

}