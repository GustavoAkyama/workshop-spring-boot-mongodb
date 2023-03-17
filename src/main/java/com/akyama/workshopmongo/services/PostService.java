package com.akyama.workshopmongo.services;

import com.akyama.workshopmongo.domain.Post;
import com.akyama.workshopmongo.services.exception.ObjectNotFoundException;
import com.akyama.workshopmongo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
