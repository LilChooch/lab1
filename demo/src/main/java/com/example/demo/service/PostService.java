package com.example.demo.service;

import com.example.demo.com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts()
    {
        List<Post> list = new ArrayList<>();
        list.add(new Post("Подипшись",1012));
        list.add(new Post("на тгк канал",102121));
        list.add(new Post("olegatgshka",99999));

        return list;
    }

}
