package br.univille.projfabsoft.service;

import java.util.List;
import java.util.Optional;

import br.univille.projfabsoft.entity.Usuario;

public interface UsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario save(Usuario usuario);
    void deleteById(Long id);
}