package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Value expression = mock(Value.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitConstExpr(expression);
    }

}