package com.acme.catchup.platform.news.domain.model.queries;

public record GetAllFavoriteSourceByNewsApiKeyQuery(String newsApiKey) {
    public GetAllFavoriteSourceByNewsApiKeyQuery {
        if (newsApiKey == null || newsApiKey.isBlank()) {
            throw new IllegalArgumentException("Api Key cannot be null or empty");
        }
    }
}
