package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        AnonymousScript expression = Mockito.mock(AnonymousScript.class);

        new PrettyPrintVisitor(printer).visitAnonymousScriptExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}