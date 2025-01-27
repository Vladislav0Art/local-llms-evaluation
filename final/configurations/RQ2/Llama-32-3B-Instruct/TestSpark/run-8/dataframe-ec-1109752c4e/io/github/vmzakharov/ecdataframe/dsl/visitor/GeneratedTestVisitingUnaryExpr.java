package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitingUnaryExpr {

    @Override
    public void accept(PrettyPrintVisitor visitor) {
        visitor.visit(this);
    }
}

public class PropertyPathExprNoValue extends Expr {
    @Override
    public void accept(PrettyPrintVisitor visitor) {
        visitor.visit(this);
    }
}

public class AliasExprNoValue extends Expr {
    @Override
    public void accept(PrettyPrintVisitor visitor) {
        visitor.visit(this);
    }
}

public class DecimalExprNoValue extends Expr {
    @Override
    public void accept(PrettyPrintVisitor visitor) {
        visitor.visit(this);
    }
}

public class VisitingUnaryExprTest {

    @Test
    public void testVisitingUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        UnaryExprNoValue expr = new UnaryExprNoValue();
        expr.accept(visitor);
        assertEquals(1, visitor.getCollectedPrinter().getCount());
    }
}

}