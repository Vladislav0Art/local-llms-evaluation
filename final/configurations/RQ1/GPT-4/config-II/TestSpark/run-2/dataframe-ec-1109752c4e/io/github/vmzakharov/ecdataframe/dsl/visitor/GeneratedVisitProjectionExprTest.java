package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.utility.StringIterate;
import org.eclipse.collections.impl.utility.ArrayIterate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void VisitProjectionExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitProjectionExpr(new ProjectionExpr(Lists.mutable.of(new VarExpr("column1", false)), null));
        Assert.assertEquals("project {column1}", printer.toString());
    }

}