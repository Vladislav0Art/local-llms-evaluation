package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.*;

import static org.junit.Assert.assertEquals;

public class GeneratedEscapeVarNameIfNeededTest {

    // Test visitAssignExpr method

    @Test
    public void escapeVarNameIfNeededTest() {
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        String varName = "testVar";
        boolean escaped = true;
        String escapedVarName = prettyPrintVisitor.escapeVarNameIfNeeded(varName, escaped);
        assertEquals("${testVar}", escapedVarName);

        escaped = false;
        escapedVarName = prettyPrintVisitor.escapeVarNameIfNeeded(varName, escaped);
        assertEquals("testVar", escapedVarName);
    }

}