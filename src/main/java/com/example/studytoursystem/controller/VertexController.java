package com.example.studytoursystem.controller;

import com.example.studytoursystem.model.Result;
import com.example.studytoursystem.model.Vertex;
import com.example.studytoursystem.service.VertexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VertexController {
    @Autowired
    private VertexService vertexService;

    @GetMapping("/vertex")
    public Result<List<Vertex>> getVertex() {
        return Result.success(vertexService.getVertex());
    }
}
