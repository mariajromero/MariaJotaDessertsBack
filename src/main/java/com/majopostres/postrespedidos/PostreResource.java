package com.majopostres.postrespedidos;

import com.majopostres.postrespedidos.model.Postre;
import com.majopostres.postrespedidos.service.PostresService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postre")
public class PostreResource {
    private final PostresService postresService;

    public PostreResource(PostresService postresService) {
        this.postresService = postresService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Postre>> getAllPostres(){
        List<Postre> postres= postresService.findAllPostres();
        return new ResponseEntity<>(postres, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Postre> getPostre(@PathVariable("id") Long id)  {
        Postre postre= postresService.getPostre(id);
        return new ResponseEntity<>(postre, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePostre(@PathVariable("id") Long id)  {
        postresService.deletePostreById(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Postre> addPostre(@RequestBody Postre postre)  {
        Postre postreNuevo= postresService.addPostre(postre);
        return new ResponseEntity<>(postreNuevo, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Postre> updatePostre(@RequestBody Postre postre)  {
        Postre postreNuevo= postresService.updatePostre(postre);
        return new ResponseEntity<>(postreNuevo, HttpStatus.OK);
    }
}
