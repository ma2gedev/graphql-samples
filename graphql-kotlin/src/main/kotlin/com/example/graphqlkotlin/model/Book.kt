package com.example.graphqlkotlin.model

import com.expedia.graphql.annotations.GraphQLDescription

@GraphQLDescription("Book")
data class Book(
        @GraphQLDescription("The book's id")
        val id: Int,
        @GraphQLDescription("The book's title")
        val title: String,
        @GraphQLDescription("The book's author")
        val author: String
)
