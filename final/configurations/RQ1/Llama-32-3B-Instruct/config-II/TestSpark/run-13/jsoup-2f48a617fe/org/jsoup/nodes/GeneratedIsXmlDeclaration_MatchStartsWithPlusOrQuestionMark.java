package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_MatchStartsWithPlusOrQuestionMark {

    @Test
    public void isXmlDeclaration_MatchStartsWithPlusOrQuestionMark() {
        // given
        String data = "!some";

        // when
        boolean result = comment.isXmlDeclaration();

        // then
        assertTrue(result);
    }

}