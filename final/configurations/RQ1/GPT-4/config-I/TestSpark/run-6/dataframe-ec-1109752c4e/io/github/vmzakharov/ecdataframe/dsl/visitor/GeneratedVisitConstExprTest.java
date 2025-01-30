package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        DecimalValue decimalconstExpr = new DecimalValue("10");
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        prettyPrintVisitor.visitConstExpr(decimalconstExpr);
        assertEquals("10", prettyPrintVisitor.toString());
    }

}