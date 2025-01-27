package io.github.vmzakharov.ecdataframe.dsl.visitor;

public class GeneratedTestVisitingAliasExpr {

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
    public void testVisitingAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        AliasExprNoValue expr = new AliasExprNoValue();
        expr.accept(visitor);
        assertEquals(3, visitor.getCollectedPrinter().getCount());
    }
}

}