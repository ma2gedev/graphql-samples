defmodule GraphqlSampleWeb.Schema.Models do
  use Absinthe.Schema.Notation

  @desc "Book"
  object :book do
    @desc "The book's id"
    field :id, non_null(:id)
    @desc "The book's title"
    field :title, non_null(:string)
    @desc "The book's author"
    field :author, non_null(:string)
  end
end
