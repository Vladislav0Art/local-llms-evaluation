package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;
import org.mockito.Mockito;

public class GeneratedVisitStatementSequenceScript_StatementSequenceScript {

    public static void main(String[] args) {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PrettyPrintVisitor.PrettyPrintVisitorFactory factory = new PrettyPrintVisitor.PrettyPrintVisitorFactory();

        PrettyPrintVisitor.PrettyPrintVisitorPrettyPrintVisitor prettyPrintVisitor =
                factory.create(PrettyPrintVisitor.class, "pretty_print_visitor", new String[]{"pretty_print_visitor"};

        prettyPrintVisitor.visitAssignmentExpr(AssingExpr expr);
        prettyPrintVisitor.visitBinaryExpr(BinaryExpr expr);

        Mockito.when(new PrettyPrintVisitorFactory().create(PrettyPrintVisitor.class, "pretty_print_visitor", new String[]{"pretty_print_visitor"})).thenReturn(prettyPrintVisitor);

        PrettyPrintVisitorPrettyPrintVisitor prettyPrintVisitor =
                factory.create(PrettyPrintVisitorPrettyPrintVisitor.class, "pretty_print_visitor", new String[]{"pretty_print_visitor"});

        prettyPrintVisitor.visitFunctionCallExpr(FunctionCallExpr expr);
    }

    @Test
    public void visitStatementSequenceScript_StatementSequenceScript() {
        PrettyPrintVisitor.PrettyPrintVisitorPrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitorPrettyPrintVisitor();
        prettyPrintVisitor.visitStatementSequenceScript(StatementSequenceScript expr);

        Mockito.when(new PrettyPrintVisitorFactory().create(PrettyPrintVisitor.class, "pretty_print_visitor", new String[]{"pretty_print_visitor"})).thenReturn(prettyPrintVisitor);
    }

}