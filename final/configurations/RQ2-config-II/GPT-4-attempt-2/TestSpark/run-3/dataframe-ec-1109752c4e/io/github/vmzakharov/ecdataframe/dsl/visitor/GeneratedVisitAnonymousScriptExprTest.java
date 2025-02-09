package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.getDefaultPrinter());
        AnonymousScript anonymousScript = new AnonymousScript();
        anonymousScript.accept(visitor);
    }

}