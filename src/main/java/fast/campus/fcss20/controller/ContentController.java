package fast.campus.fcss20.controller;

import fast.campus.fcss20.domain.Content;
import fast.campus.fcss20.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ContentController {
    private final ContentService contentService;

    @GetMapping("/api/v1/contents/{name}")
    public List<Content> findAllV1(@PathVariable String name) {
        return contentService.findAllByName(name);
    }

    @GetMapping("/api/v2/contents/{name}")
    public List<Content> findAllV2(@PathVariable String name) {
        return contentService.findAllByNameWithAuthentication(name);
    }
}
