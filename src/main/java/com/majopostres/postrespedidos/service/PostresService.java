package com.majopostres.postrespedidos.service;

import com.majopostres.postrespedidos.exceptions.PostreNotFoundException;
import com.majopostres.postrespedidos.model.Postre;
import com.majopostres.postrespedidos.repo.PostreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostresService {
    private final PostreRepo postresRepo;

    @Autowired
    public PostresService(PostreRepo postresRepo) {
        this.postresRepo = postresRepo;
    }
    public Postre addPostre(Postre postre){
        postre.setCategory("galletas");
        return postresRepo.save(postre);
    }
    public Postre getPostre(Long id){
        return postresRepo.findPostreById(id).orElseThrow(()-> new PostreNotFoundException("postre with id" + id +" not found"));
    }
    public List<Postre> findAllPostres(){
        return postresRepo.findAll();
    }
    public Postre updatePostre(Postre postre){
        return postresRepo.save(postre);
    }
    @Transactional
    public void deletePostreById(Long id){
         postresRepo.deletePostreById(id);
    }
}
