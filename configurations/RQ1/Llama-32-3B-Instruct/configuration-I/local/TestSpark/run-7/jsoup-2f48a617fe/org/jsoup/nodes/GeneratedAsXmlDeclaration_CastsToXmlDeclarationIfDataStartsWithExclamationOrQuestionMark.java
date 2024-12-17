package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_CastsToXmlDeclarationIfDataStartsWithExclamationOrQuestionMark {

    @Test
    public void asXmlDeclaration_CastsToXmlDeclarationIfDataStartsWithExclamationOrQuestionMark() {
        Comment comment = new Comment("! declaration");
        XmlDeclaration result = comment.asXmlDeclaration();
        assertNotNull(result);
    }

}