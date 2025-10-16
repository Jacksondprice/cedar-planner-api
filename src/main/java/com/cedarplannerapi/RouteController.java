package com.cedarplannerapi;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/routes")
public class RouteController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
