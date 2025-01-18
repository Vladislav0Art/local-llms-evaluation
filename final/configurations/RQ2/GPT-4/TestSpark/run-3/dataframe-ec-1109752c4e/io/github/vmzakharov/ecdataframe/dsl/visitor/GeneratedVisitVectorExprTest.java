package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        VectorExpr vectorExpr = Mockito.mock(VectorExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitVectorExpr(vectorExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

}