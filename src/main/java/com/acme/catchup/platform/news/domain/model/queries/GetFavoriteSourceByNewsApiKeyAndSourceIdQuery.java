package com.acme.catchup.platform.news.domain.model.queries;

public record GetFavoriteSourceByNewsApiKeyAndSourceIdQuery(String newsApikey,
                                                            String sourceId) {
    public GetFavoriteSourceByNewsApiKeyAndSourceIdQuery {
        if (newsApikey == null) {
            throw new IllegalArgumentException("newsApiKey cannot be null");
        }
        if (sourceId == null) {
            throw new IllegalArgumentException("sourceId cannot be null");
        }
    }
}
