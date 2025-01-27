package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildMethod_ThrowsExceptionIfContainerIsNull {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildMethod_ThrowsExceptionIfContainerIsNull() {
        when(container).isNull();
        assertThrows(GraphQLAnnotationsException.class, () -> new DirectivesBuilder(object, null).build());
    }
}

public class DirectivesBuilder {

    private final AnnotatedElement object;
    private final ProcessingElementsContainer container;

    public DirectivesBuilder(AnnotatedElement object, ProcessingElementsContainer container) {
        this.object = object;
        this.container = container;
    }

    @Override
    public GraphQLDirective[] build() {
        List<GraphQLDirective> directives = new ArrayList<>();
        for (String directive : DirectiveJavaAnnotationUtil.getDirectivesAsNames(object)) {
            if ("GRAPHQL_DIRECTIVES".equals(directive)) {
                continue;
            }
            String javaName = DirectiveJavaAnnotationUtil.getJavaName(directive);
            GraphQLType type = object.getType(javaName);
            directives.add(newDirective(type));
        }
        return directives.toArray(new Object[0]);
    }

}