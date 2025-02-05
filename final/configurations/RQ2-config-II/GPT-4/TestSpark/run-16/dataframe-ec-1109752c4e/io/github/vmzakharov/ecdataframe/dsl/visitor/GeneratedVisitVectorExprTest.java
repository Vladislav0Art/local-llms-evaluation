package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.systemOutPrinter());
        visitor.visitVectorExpr(new VectorExpr(new DecimalExpr(new DecimalValue(10)), new VarExpr("var")));
    }

}