package com.majopostres.postrespedidos.repo;

import com.majopostres.postrespedidos.model.Postre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostreRepo extends JpaRepository<Postre, Long> {
    void deletePostreById(Long id);
    Optional <Postre> findPostreById(Long id);
}
