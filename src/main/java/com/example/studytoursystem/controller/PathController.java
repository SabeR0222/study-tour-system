package com.example.studytoursystem.controller;

import com.example.studytoursystem.model.PathQuery;
import com.example.studytoursystem.model.Result;
import com.example.studytoursystem.service.PathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PathController {
    @Autowired
    private PathService pathService;

    @PostMapping("/path")
    public Result<List<Integer>> getPath(@RequestBody PathQuery query) {
        return Result.success(pathService.getPath(query));
    }
}
