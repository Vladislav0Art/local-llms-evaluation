package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedBuildArgumentTypesEmpty {

    @Test
    public void buildArgumentTypesEmpty() {
        GraphQLDirectives directives = new GraphQLDirectives("directives");
        assertTrue(buildArgumentTypes(directives).isEmpty());
    }

    private List<GraphQLType> buildArgumentTypes(GraphQLDirectives directives) {
        return Arrays.stream(directives.getTypes()).collect(Collectors.toList());
    }

    private void addArgumentType(GraphQLDirectives directives, GraphQLArgument argumentType) {
        directives.getType().add(argumentType);
    }

}