package com.akyama.workshopmongo.resources;

import com.akyama.workshopmongo.domain.Post;
import com.akyama.workshopmongo.domain.User;
import com.akyama.workshopmongo.dto.UserDTO;
import com.akyama.workshopmongo.services.PostService;
import com.akyama.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

