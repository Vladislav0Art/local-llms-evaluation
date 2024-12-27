package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;

import graphql.annotations.processor.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.annotations.annotationTypes.GraphQLDirective;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedTest {

    class DirectivesBuilderExtended extends DirectivesBuilder {

        private int count = 0;

        public DirectivesBuilderExtended(AnnotatedElement object, ProcessingElementsContainer container) {
            super(object, container);
        }

        @Override
        public Object[] build() {
            Object[] result = new Object[count];
            return result;
        }

        public void markDirective() {
            count++;
        }
    }

}