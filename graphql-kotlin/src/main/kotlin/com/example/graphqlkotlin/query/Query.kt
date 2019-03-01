package com.example.graphqlkotlin.query

import com.example.graphqlkotlin.model.Book
import com.expedia.graphql.annotations.GraphQLDescription

class Query {
    @GraphQLDescription("returns book list")
    fun books(): List<Book?> = listOf(
            Book(
                    1,
                    "エムスリーテックブック#1",
                    "エムスリーエンジニアリンググループ執筆部"
            )
        )
}
