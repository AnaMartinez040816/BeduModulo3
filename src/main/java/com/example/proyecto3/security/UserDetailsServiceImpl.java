package com.example.proyecto3.security;

import com.example.proyecto3.models.Usuario;
import com.example.proyecto3.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findOneByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("El correo no se encontró"));
        return new UserDetailsImpl(usuario);
    }
}
