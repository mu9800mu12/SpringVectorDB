package kopo.poly.service;

import java.util.Map;
import java.util.Objects;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "EmbeddingClient", url = "${embedding.api.url}")
public interface IEmbeddingClient {

    @PostMapping("/embedding")
    Map<String, Object> generateEmbedding(@RequestParam Map<String, String> requestBody);

}
