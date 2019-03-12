defmodule GraphqlSampleWeb.Schema do
  use Absinthe.Schema

  query do
    @desc "Hello world!"
    field :hello, :string do
      resolve fn _, _ ->
        {:ok, "world!"}
      end
    end
  end
end
