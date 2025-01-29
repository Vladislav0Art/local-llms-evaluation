package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitProjectionExpr {

    private Printer printer;
    private int line = 1;

    public PrettyPrintVisitorImpl(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void visitAssignExpr(AssingExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "AssignExpr(" + exprStr + ")");
        printer.printValue(0);
    }

    @Override
    public void visitBinaryExpr(BinaryExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "BinaryExpr(" + exprStr + ")");
        printer.printOperator(2, "=", 1);
        int leftLine = line;
        for (Expression op : expr.getOperators()) {
            printer.println("  " + (line++) + "  " + op.toString());
        }
    }

    @Override
    public void visitUnaryExpr(UnaryExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "UnaryExpr(" + exprStr + ")");
        printer.printOperator(1, "-", leftLine);
        int leftLeftLine = line;
        for (Expression op : expr.getOperators()) {
            printer.println("  " + (line++) + "  " + op.toString());
        }
    }

    @Override
    public void visitConstExpr(Value expr) {
        printer.printValue(0, expr.getValue().toString());
    }

    @Override
    public void visitFunctionCallExpr(FunctionCallExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "FunctionCallExpr(" + exprStr + ")");
        int leftLine = line;
        for (Expression func : expr.getFunctions()) {
            printer.println("  " + (line++) + "  " + func.toString());
        }
    }

    @Override
    public void visitPropertyPathExpr(PropertyPathExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "PropertyPathExpr(" + exprStr + ")");
    }

    @Override
    public void visitAnonymousScriptExpr(AnonymousScript expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "AnonymousScriptExpr(" + exprStr + ")");
        for (Expression expr : expr.getArguments()) {
            printer.printValue(0, expr.toString());
        }
    }

    @Override
    public void visitFunctionScriptExpr(FunctionScript expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "FunctionScriptExpr(" + exprStr + ")");
        for (Expression func : expr.getFunctions()) {
            printer.println("  " + (line++) + "  " + func.toString());
        }
    }

    @Override
    public void visitStatementSequenceScript(StatementSequenceScript expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "StatementSequenceScript(" + exprStr + ")");
        for (Statement statement : expr.getStatements()) {
            printer.printValue(0, statement.toString());
        }
    }

    @Override
    public void visitVarExpr(VarExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "VarExpr(" + exprStr + ")");
    }

    @Override
    public void visitProjectionExpr(ProjectionExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "ProjectionExpr(" + exprStr + ")");
    }

    @Override
    public void visitAliasExpr(AliasExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "AliasExpr(" + exprStr + ")");
    }

    @Override
    public void visitVectorExpr(VectorExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "VectorExpr(" + exprStr + ")");
    }

    @Override
    public void visitIndexExpr(IndexExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "IndexExpr(" + exprStr + ")");
        int leftLine = line;
        for (Expression op : expr.getOperators()) {
            printer.println("  " + (line++) + "  " + op.toString());
        }
    }

    @Override
    public void visitDecimalExpr(DecimalExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "DecimalExpr(" + exprStr + ")");
    }

    @Override
    public void visitIfElseExpr(IfElseExpr expr) {
        String exprStr = exprToString(expr);
        printer.println("  " + (line++) + "IfElseExpr(" + exprStr + ")");
    }
}

public class PrettyPrintVisitorTest {

    private PrettyPrintVisitor prettyPrintVisitor;

    @Test
    public void testVisitProjectionExpr() {
        PrettyPrintVisitorImpl prettyPrintVisitor = new PrettyPrintVisitorImpl(new Printer());
        PrettyPrintVisitor.prettyPrintVisitor = prettyPrintVisitor;
        ProjectionExpr expr = new ProjectionExpr("x", 5);
        prettyPrintVisitor.visitProjectionExpr(expr);
    }

}